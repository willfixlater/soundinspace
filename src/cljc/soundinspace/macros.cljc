(ns soundinspace.macros
  (:require [secretary.core :as secretary
             :include-macros true]
            [re-frame.core :as re-frame]))

(defmacro defroute [name-sym route component]
  (let [params-sym (gensym)]
    `(do
       (defn- component-name# [] ~component)
       (set! soundinspace.routes/*routes*
             (assoc soundinspace.routes/*routes*
                    ~(keyword name-sym) component-name#))
       (secretary/defroute ~name-sym ~route {:as params#}
         (re-frame/dispatch [:routing/set-current-route
                             ~(keyword name-sym)
                             params#])))))
