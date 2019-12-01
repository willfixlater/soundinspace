(ns soundinspace.events
  (:require [re-frame.core :refer [reg-event-db]]
            [soundinspace.db :as db]
            [soundinspace.events.routing]))

(defn init* [_ _]
  (db/init-db))

(reg-event-db :init init*)
