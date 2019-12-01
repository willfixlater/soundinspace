(ns soundinspace.routes-spec
  (:require [cljs.spec.alpha :as s]))

(s/def ::path (s/coll-of keyword? :kind vector?))
(s/def ::params (s/map-of keyword? any?))
(s/def ::current-path (s/keys :req-un [::path ::params]))
