(ns soundinspace.components
  (:require [soundinspace.components.header-title :refer [header-title]]
            [soundinspace.components.header-links :refer [header-links]]
            [soundinspace.components.lunar-ellipsis :refer [lunar-ellipsis]]))

(defn root []
  [:div.container
   [:header
    [header-title "sound in space"]
    [header-links
     [:a {:href "#"} "Blog"]
     [:a {:href "https://github.com/shadizzle"} "Projects"]
     [:a {:href "#"} "Contact"]]]
   [:main
    [:p {:style {:text-align :center}} "Coming Soon"]]])

