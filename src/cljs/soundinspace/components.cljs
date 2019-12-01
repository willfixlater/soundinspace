(ns soundinspace.components
  (:require [re-frame.core :refer [subscribe]]
            [soundinspace.routes :as routes]
            [soundinspace.components.header-title :refer [header-title]]
            [soundinspace.components.header-links :refer [header-links]]
            [soundinspace.components.link :refer [link]]
            [soundinspace.components.lunar-ellipsis :refer [lunar-ellipsis]]))

(defn not-found []
  [:div {:style {:text-align :center}}
   "You strayed too far and now you are lost..."])

(defn root []
  (let [current-route (subscribe [:routing/current-route])]
    [:div.container
     [:header
      [header-title "sound in space"]
      [header-links
       [link {:href "/" :route-id :index}
        "Blog"]
       [link {:href "https://github.com/shdzzl" :external? true}
        "Projects"]
       [link {:href "/" :route-id :index}
        "Contact"]]]
     [:main
      [(get routes/*routes* (:id @current-route) not-found)]]]))
