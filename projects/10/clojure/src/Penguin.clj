;;;; Penguin.clj provides an Penguin "class".
;;;; 
;;;; Begun by: Prof. Adams, for CS 214 at Calvin College.
;;;; Completed by: Quentin Barnes
;;;; Date: May 7, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 

;; bring in 'Bird' (to be used as 'superclass')

(load "Bird")


;; define 'Penguin' as 'subclass' of Bird

(defrecord Penguin [^Bird name movement] )


;;; Penguin constructors
;;; - default: no args
;;;   Postcondition: name == a default value. 
;;; - explicit1:
;;;   Receive: itsName, a String
;;;   Postcondition: name == itsName.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn make-Penguin     
  ([]                (->Penguin "Ann Onymous" "walked past"))
  ([^String itsName] (->Penguin itsName "walked past"))
)


;;; method to retrieve a Penguin's class
;;; Receive: this, a Penguin object.
;;; Return: "Penguin".
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defmethod getClass Penguin [ _ ]
  "Penguin"
)

;;; method to retrieve a Penguin's call
;;; Receive: this, a Penguin object.
;;; Return: "Whoo-hoo!"
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defmethod getCall Penguin [ _ ]
  "Huh-huh-huh-huuuuh!"
)


