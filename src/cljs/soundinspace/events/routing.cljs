(ns soundinspace.events.routing
  (:require [re-frame.core :refer [reg-event-db]]))

(defn set-current-route* [db [_ id params]]
  (assoc db :routing/current-route {:id id :params params}))

(reg-event-db :routing/set-current-route set-current-route*)
