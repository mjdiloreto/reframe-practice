(ns searchbox.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::search-result
 (fn [db]
   (:search-result db)))
