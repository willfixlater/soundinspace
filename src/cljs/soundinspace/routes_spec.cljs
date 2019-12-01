(ns soundinspace.routes-spec
  (:require [cljs.spec.alpha :as s]))

(s/def ::id keyword?)
(s/def ::params (s/map-of keyword? any?))
(s/def ::current-route (s/keys :req-un [::id ::params]))
