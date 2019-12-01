(ns soundinspace.routes
  (:require [secretary.core :as secretary :refer-macros [defroute]]
            [re-frame.core :as re-frame :refer [dispatch]]))

(defroute index "/" []
  (dispatch [:routing/set-current-path :index]))
