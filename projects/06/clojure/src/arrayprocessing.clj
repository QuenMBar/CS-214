;  arrayprocessing.clj allows the user to enter an array and print the entered array

;  Student Name: Quentin Barnes
;  Date: 3/14/19

;  Recive: the values of an array
;  Output: the entered array
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns arrayprocessing)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; readArray() is a function that lets the user enter values into an array
; Recives: An array, its size, and the times its run
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn readArray [aVec, itsSize, i]
  (if (<= i (- itsSize 1))
    (let
      [ theVal (double (read)) ]
      (aset aVec i theVal)
      (readArray aVec itsSize (+ i 1))
    )
  )
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; printArray() is a function that prints an array that it is given based on the
; size it is given 
; Recives: An array, its size, and the times its run
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
   
(defn printArray [aVec, itsSize, i]
    (if (<= i (- itsSize 1))
      (do 
        (println (nth aVec i) ) (flush)
        (printArray aVec itsSize (+ i 1))
      )
    )
)

(defn -main []

  (print "\nEnter the size of the array: ") (flush)
  (let
    [ theSize (int (read)) ]

    (def theArray (make-array Double/TYPE theSize))
    
    (println "Enter values: ")
    (readArray theArray theSize 0)

    (println "Enter the array entered is: ") (flush)
    (printArray theArray theSize 0)
  )
)

