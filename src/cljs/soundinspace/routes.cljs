(ns soundinspace.routes
  (:require-macros [soundinspace.macros :refer [defroute]]))

(defn same-route?
  [{a-id :id a-params :params}
   {b-id :id b-params :params}]
  (let [a-params (when-not (empty? a-params) a-params)
        b-params (when-not (empty? b-params) b-params)]
    (and (= a-id b-id) (= a-params b-params))))

(defonce ^:dynamic *routes* {})

(defroute index "/"
  [:p {:style {:text-align :center}}
   "Coming Soon"])
