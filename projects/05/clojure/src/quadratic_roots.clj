;;; QuadraticRoots.java is a program for finding the roots of a quadratic 
;;; function y = ax^2 + bx + c where a, b, c are given by the user.
;;;
;;; Input: a, b, c as floats.
;;; Output: the roots of y = ax^2 + bx + c with the users variables.
;;;
;;; Written by: Quentin Barnes on March 5, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns quadratic_roots)      ; name the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; quadraticRoots() finds the roots of a quadratic 
;;; function y = ax^2 + bx + c
;;; Receive: a, b, c as doubles                  
;;; Return: roots 1 and 2 of the function
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn quadraticRoots [a b c]
  (if (not= a 0)
    (let
      [arg (- (Math/pow b 2) (* 4 (* a c)))]
      (if (>= arg 0)
        (let
          [firstRoot (/ (+ (* b -1) (Math/sqrt arg)) (* 2 a))
          secondRoot (/ (- (* b -1) (Math/sqrt arg)) (* 2 a))]

          (vector firstRoot secondRoot)
        )
        (let 
          [firstRoot (- 0.0 0.0)
          secondRoot (- 0.0 0.0)]
          (printf "*** quadraticRoots(): b^2 - 4ac is negative!") (flush)

          (vector firstRoot secondRoot)
        )
      )
    )
    (let
      [firstRoot (- 0.0 0.0)
      secondRoot (- 0.0 0.0)]
      (printf "*** QuadraticRoots(): a is zero!") (flush)

      (vector firstRoot secondRoot)
    )
  )
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; main function
;;; Input: a, b, c as doubles.
;;; Output: the roots of y = ax^2 + bx + c with the users variables
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn -main []
  (print "To compute the roots of a quadratic equation given an equasion of the form: y = ax^2 + bx + c, Enter a:") (flush)
  (let
    [ aIn (read) ]                      ; read the double a
    (print "Enter b: ") (flush)
    (let 
      [ bIn (read) ]                     ; read the double b
      (print "Enter c: ") (flush)
      (let 
        [ cIn (read)                      ; read the double c
          result (quadraticRoots aIn bIn cIn)               ; Find the roots
          root1 (get result 0)                              ; retrieve the two
          root2 (get result 1)                              ; parts
        ]
                                                 
        (printf (str "\nThe first part is \"%f\" and"       ; display the parts
                      " the second part is \"%f\"\n\n")
                        root1 root2)
      )
    )
  )
)

