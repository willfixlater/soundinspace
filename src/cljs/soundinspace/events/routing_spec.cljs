(ns soundinspace.events.routing-spec
  (:require [cljs.spec.alpha :as s]
            [cljs.spec.test.alpha :as s.test]
            [soundinspace.db-spec :as db.spec]
            [soundinspace.routes-spec :as routes.spec]
            [soundinspace.events.routing :as routing]))

(s/fdef routing/set-current-route*
        :args (s/cat :db ::db.spec/db
                     :event-vec (s/cat :event keyword?
                                       :path ::routes.spec/path
                                       :query-params
                                         (s/? ::routes.spec/query-params)
                                       :fragment (s/? ::routes.spec/fragment)))
        :ret ::db.spec/db)
