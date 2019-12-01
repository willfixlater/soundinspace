(ns soundinspace.components.link
  (:require [re-frame.core :as re-frame :refer [subscribe]]))

(defn- same-route?
  [{a-id :id a-params :params}
   {b-id :id b-params :params}]
  (let [a-params (when-not (empty? a-params) a-params)
        b-params (when-not (empty? b-params) b-params)]
    (and (= a-id b-id) (= a-params b-params))))

(defn link
  [{:as opts :keys [route-id route-params external?]}
   & body]
  (let [current-route (subscribe [:routing/current-route])
        this-route {:id route-id :params route-params}
        opts (-> opts
                 (assoc :on-click
                        (fn [e]
                          (when-not external?
                            (.preventDefault e))
                          (when-not (same-route? this-route @current-route)
                            (re-frame/dispatch [:routing/set-current-route
                                                route-id
                                                route-params]))))
                 (dissoc [:route-id :route-params :external?]))
        anchor-tag (if (same-route? this-route @current-route)
                     :a.link.link--disabled
                     :a.link)]
    (into [anchor-tag opts] body)))
