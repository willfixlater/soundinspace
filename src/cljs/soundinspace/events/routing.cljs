(ns soundinspace.events.routing
  (:require [re-frame.core :refer [reg-event-db]]
            [soundinspace.routes :as routes]))

(defn set-current-path* [db [_ path params]]
  (assoc db ::routes/current-path {:path path :params params}))

(reg-event-db :routing/set-current-path set-current-path*)
