(ns soundinspace.subs.routing
  (:require [re-frame.core :refer [reg-sub]]))

(defn current-route* [db _]
  (:routing/current-route db))

(reg-sub :routing/current-route current-route*)
