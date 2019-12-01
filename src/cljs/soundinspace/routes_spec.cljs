(ns soundinspace.routes-spec
  (:require [cljs.spec.alpha :as s]))

(s/def :soundinspace.routes-spec.path/id (s/coll-of keyword? :kind vector?))
(s/def :soundinspace.routes-spec.path/params (s/map-of keyword? any?))
(s/def ::path (s/keys :req-un [:soundinspace.routes-spec.path/id
                               :soundinspace.routes-spec.path/params]))

(s/def ::query-params (s/map-of keyword? any?))
(s/def ::fragment string?)
(s/def ::current-route (s/keys :req-un [::path ::query-params ::fragment]))
