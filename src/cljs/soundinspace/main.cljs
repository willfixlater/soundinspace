(ns soundinspace.main
  (:require [reagent.core :as r]
            [re-frame.core :as re-frame]
            [secretary.core :as secretary]
            [goog.events :as events]
            [soundinspace.components :refer [root]]
            [soundinspace.routes]
            [soundinspace.events]
            [soundinspace.subs])
  (:import [goog History]
           [goog.history EventType]))

(enable-console-print!)

(def history
  (doto (History.)
    (events/listen EventType.NAVIGATE
                   (fn [event] (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

(defn ^:dev/after-load render []
  (let [mount-node (js/document.getElementById "main")]
    (r/render [root] mount-node)))

(defn ^:export init []
  (re-frame/dispatch-sync [:init])
  (render))

(def reload! (constantly nil))
