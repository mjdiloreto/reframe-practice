(ns counter.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::counter-value
 (fn [db]
   (:counter-value db)))
