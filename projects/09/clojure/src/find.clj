;; find.clj tests a function to search a list for a value.
;;
;; Output: four lists, and 
;;          the results of calling a listSearch() function on them.
;;
;; Usage: clojure -m find
;;
;; Begun by: Dr. Adams, CS 214 at Calvin College.
;; Completed by: Quentin Barnes
;; Date: May 6, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns find)

(load "listOps")                      ; load module

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Function -main tests function listSearch(). 
;; Output: the results of testing listSearch() on various lists.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn -main []
  (let
    [ 
      list1 '(99 88 77 66 55)        ; 99 is first value
      list2 (list 55 66 77 88 99)    ; 99 is last value
      list3 (list 55 77 99 88 66)    ; 99 is middle value
      list4 (list 55 77 45 88 66)    ; 99 doesnt exist
    ]

    (println)
    (println "list1: " list1)        ; print list1,
    (println "list2: " list2)        ;   list2,
    (println "list3: " list3)        ;   list3,
    (println "list4: " list4)        ;   list4,
    (println)                        ;   and their search
    (println "The position of 99 in list1 is: " (listSearch list1 99 0))
    (println "The position of 99 in list2 is: " (listSearch list2 99 0))
    (println "The position of 99 in list3 is: " (listSearch list3 99 0))
    (println "The position of 99 in list4 is: " (listSearch list4 99 0))
    (println)
  )
)

