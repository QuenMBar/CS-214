;;;; nLoop.clj computes the factorial of a given number..
;;;;
;;;; Input: n, an int.
;;;; Precondition: n >= 2.
;;;; Output: The factorial of the inputed number
;;;;
;;;; Begun by: Prof. Adams, for CS 214 at Calvin College.
;;;; Completed and edited by: Quentin Barnes on Feb 23, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns nLoop)                                 ; name the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; nLoop() computes the factorial of a given number..
;;; Receive: n, an int.
;;; Precondition: n >= 2.
;;; Output: The factorial of the inputed number
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; direct-recursive version

(defn nLoop [i n answer]
  (if (< i n)
    (nLoop (+ i 1) n (* answer i))
    (println n "! = " (* answer i))
  )
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; -main is a 'driver' for the displayLogTable() functions.
;;; Input: n
;;; Output: The factorial of the inputed number
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn -main []
 (print "To compute n!, enter n: ") (flush)
 (let
    [ n (int (read))] 
    (println)
    (nLoop 2 n 1.0)
    (println)
 )
)

