(ns searchbox.events
  (:require
   [re-frame.core :as re-frame]
   [searchbox.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

(re-frame/reg-event-db
 ::set-search-result
 (fn [db [_ val]]
   (assoc db :search-result val))) ; This would issue an AJAX request.
