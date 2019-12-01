(ns soundinspace.db-spec
  (:require [cljs.spec.alpha :as s]
            [soundinspace.routes-spec :as sroutes]))

(s/def ::db (s/keys :req [::sroutes/current-path]))
