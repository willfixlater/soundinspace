(ns soundinspace.routes
  (:require-macros [soundinspace.macros :refer [defroute]]))

(defonce ^:dynamic *routes* {})

(defroute index "/"
  [:p {:style {:text-align :center}}
   "Coming Soon"])
