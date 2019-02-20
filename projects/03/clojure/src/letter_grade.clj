;;;; year_codes.clj is a driver for function yearCode.
;;;;
;;;; Input: An academic year, one of {freshman, sophomore,
;;;;                                  junior, senior}.
;;;; Output: The code for that academic year
;;;;         (1, 2, 3, 4 for valid entries; 
;;;;          0 for invalid entries).
;;;;
;;;; Usage: clojure -m year_codes
;;;;
;;;; Begun by: Prof. Adams, for CS 214 at Calvin College.
;;;; Completed by: Quentin Barnes
;;;; Date: Feb 15, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns letter_grade)                    ; name the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; yearCode() returns the code for a given academic year.
;;; Receive: year, a string.
;;; Precondition: year is one of 
;;;   {freshman, sophomore, junior or senior}.
;;; Return: the integer code corresponding to year.
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
;;; Function -main() test-drives our yearCode() function.
;;; Input: year: one of {freshman, sophomore, junior, or senior}.
;;; Output: the code corresponding to year.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn -main []
 (print "\nEnter your grade average: ") (flush)
 (let
    [ average (read-line) ]                ; read year (a string)
    (println "Your average is: " (letterGrade average) )      ; display its code
 )
)

