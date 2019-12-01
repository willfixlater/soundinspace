(ns soundinspace.db-spec
  (:require [cljs.spec.alpha :as s]
            [soundinspace.routes-spec :as routes.spec]))

(s/def :routing/current-route (s/keys :req-un [::routes.spec/id
                                               ::routes.spec/params]))

(s/def ::db (s/keys :req [:routing/current-route]))
