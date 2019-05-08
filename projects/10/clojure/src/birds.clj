;; birds.clj illustrates inheritance and polymorphism in Clojure.
;;
;; Output: the results of testing the Bird functions.
;;
;; Usage: clojure -m birds
;;
;; Begun by: Prof. Adams, for CS 214 Lab 10 at Calvin College.
;;;; Completed by: Quentin Barnes
;;;; Date: May 7, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns birds
  (:require
    [Bird]
    [Duck]
    [Goose]
    [Owl]
    [Penguin]
    [Ostrich]
    [Kiwi]
  )
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Function -main tests the classes in the Bird hierarchy.
;;; Output: the results of testing the Bird functions.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn -main []
  (let
    [                              ;; Birds
     bird0 (make-Bird)            ; default Bird constructor
     bird1 (make-Bird "Hawkeye")  ; explicit Bird constructor
                                   ;; Ducks
     bird2 (make-Duck)            ; default Duck constructor
     bird3 (make-Duck  "Donald")  ; explicit Duck constructor
                                   ;; Geese
     bird4 (make-Goose)           ; default Goose constructor
     bird5 (make-Goose "Mother")  ; explicit Goose constructor
                                   ;; Owls
     bird6 (make-Owl)             ; default Owl constructor
     bird7 (make-Owl "Woodsey")   ; explicit Owl constructor

     bird8 (make-Ostrich)             ; default Owl constructor
     bird9 (make-Ostrich "Orville")   ; explicit Owl constructor

     bird10 (make-Kiwi)             ; default Owl constructor
     bird11 (make-Kiwi "Kevin")   ; explicit Owl constructor

     bird12 (make-Penguin)             ; default Owl constructor
     bird13 (make-Penguin "Peter")   ; explicit Owl constructor
    ]

    (println "\nWelcome to the Bird Park!\n")
    (println (toString bird0))
    (println (toString bird1))
    (println)
    (println (toString bird2))
    (println (toString bird3))
    (println)
    (println (toString bird4))
    (println (toString bird5))
    (println)
    (println (toString bird6))
    (println (toString bird7))
    (println)
    (println (toString bird8))
    (println (toString bird9))
    (println)
    (println (toString bird10))
    (println (toString bird11))
    (println)
    (println (toString bird12))
    (println (toString bird13))
    (println)
    (println "Goodbye, and come again!\n")
    (println)
  )
)
 
