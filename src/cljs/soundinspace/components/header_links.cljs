(ns soundinspace.components.header-links)

(defn header-links [& children]
  (into
   [:div.header-links]
   (for [child children]
     [:div.header-links__item child])))
