(ns soundinspace.events.routing-spec
  (:require [cljs.spec.alpha :as s]
            [cljs.spec.test.alpha :as s.test]
            [soundinspace.db-spec :as db.spec]
            [soundinspace.routes-spec :as routes.spec]
            [soundinspace.events.routing :as routing]))

(s/fdef routing/set-current-route*
        :args (s/cat :db ::db.spec/db
                     :event-vec (s/cat :event keyword?
                                       :id ::routes.spec/id
                                       :params (s/? ::routes.spec/params)))
        :ret ::db.spec/db)
