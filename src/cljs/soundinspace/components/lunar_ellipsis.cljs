(ns soundinspace.components.lunar-ellipsis)

(defn lunar-ellipsis []
  (into
   [:div.lunar-ellipsis]
   (repeat 3 [:div.lunar-ellipsis__point])))
