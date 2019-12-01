(ns soundinspace.db-spec
  (:require [cljs.spec.alpha :as s]
            [soundinspace.routes-spec :as routes.spec]))

(s/def ::db (s/keys :req [:routing/current-route]))
