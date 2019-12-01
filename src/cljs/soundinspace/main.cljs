(ns soundinspace.main
  (:require [reagent.core :as r]
            [secretary.core :as secretary]
            [goog.events :as events]
            [soundinspace.components :refer [root]]
            [soundinspace.routes]
            [soundinspace.events]
            [soundinspace.subs])
  (:import [goog History]
           [goog.history EventType]))

(enable-console-print!)

(def reload! (constantly nil))

(def history
  (doto (History.)
    (events/listen EventType.NAVIGATE
                   (fn [event] (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

(defn ^:export render []
  (let [mount-node (js/document.getElementById "main")]
    (r/render [root] mount-node)))

(defn ^:export init []
  (render))
