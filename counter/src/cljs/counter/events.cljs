(ns counter.events
  (:require
   [re-frame.core :as re-frame]
   [counter.db :as db]
   [day8.re-frame.tracing :refer-macros [fn-traced]]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn-traced [_ _]
   db/default-db))

(re-frame/reg-event-db
 ::counter-inc
 (fn [db _]
   (assoc db :counter-value (inc (:counter-value db)))))
