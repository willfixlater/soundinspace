(ns soundinspace.test)

(defn start []
  (assert (= 2 2)))

(defn stop [done]
  (done))

(defn ^:export init []
  (start))
