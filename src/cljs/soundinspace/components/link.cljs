(ns soundinspace.components.link
  (:require [re-frame.core :as re-frame :refer [subscribe]]
            [soundinspace.routes :refer [same-route?]]))

;; TODO: Infer href for internal routes by re-working route/*routes* to inlcude
;; urls
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
