;;;; letter_grade.clj is a driver for function letterGrade.
;;;;
;;;; Input: average: an int that is <= 100 and >= 0
;;;; Output: A letter grade A, B, C, D, or F
;;;;
;;;; Usage: clojure -m letter_grade
;;;;
;;;; Begun by: Prof. Adams, for CS 214 at Calvin College.
;;;; Completed and Edited by by: Quentin Barnes
;;;; Date: Feb 23, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns letter_grade)                    ; name the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; letterGrade() returns the code for a given grade average.
;;; Receive: average, an int.
;;; Precondition: average is <= 100 and >= 0
;;; Return: A letter grade A, B, C, D, or F
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; solution using the cond function
(defn letterGrade [average]
  (cond
    (= average 10)   "A"
    (= average 9)    "A"
    (= average 8)    "B"
    (= average 7)    "C"
    (= average 6)    "D"
    :else            "F"
  )
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Function -main() test-drives our letterGrade() function.
;;; Input: average: an int that is <= 100 and >= 0
;;; Output: A letter grade A, B, C, D, or F
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn -main []
 (print "\nEnter your grade average: ") (flush)
 (let
    [ average (read-line) ]                ; read year (a string)
    (println "Your average is: " (letterGrade ( quot (Integer/parseInt average) 10) ) )      ; display its code
 )
)

