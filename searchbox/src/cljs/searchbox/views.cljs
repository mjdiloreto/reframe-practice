(ns searchbox.views
  (:require
   [re-frame.core :as re-frame]
   [searchbox.subs :as subs]
   ))

(defn main-panel []
  (let [result (re-frame/subscribe [::subs/search-result])]
    [:div
     [:h1 "What you typed,"]
     [:h1 @result ","]
     [:h1 "has " (if (even? (count @result)) "even" "odd") " length"] ; Imagine this searched something.
     [:input {:on-change #(re-frame/dispatch [:searchbox.events/set-search-result (-> % .-target .-value)])}]
     ]))

