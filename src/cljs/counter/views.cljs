(ns counter.views
  (:require
   [re-frame.core :as re-frame]
   [counter.subs :as subs]
   ))

(defn main-panel []
  (let [val (re-frame/subscribe [::subs/counter-value])]
    [:div
     [:h1 "Counter value is " @val]
     ]))

