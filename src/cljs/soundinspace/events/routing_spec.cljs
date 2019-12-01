(ns soundinspace.events.routing-spec
  (:require [cljs.spec.alpha :as s]
            [cljs.spec.test.alpha :as stest]
            [soundinspace.db-spec :as sdb]
            [soundinspace.routes-spec :as sroutes]
            [soundinspace.events.routing :as routing]))

(s/fdef routing/set-current-path*
        :args (s/cat :db ::sdb/db
                     :event-vec (s/cat :event keyword?
                                       :path ::sroutes/path
                                       :params (s/? ::sroutes/params)))
        :ret ::sdb/db)
