;;;; Goose.clj provides a Goose "class".
;;;; 
;;;; Begun by: Prof. Adams, for CS 214 at Calvin College.
;;;; Completed by: Quentin Barnes
;;;; Date: May 7, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; bring in 'Bird' (to be used as 'superclass')

(load "Bird")


;; define 'Goose' as 'subclass' of Bird

(defrecord Goose [^Bird name movement] )


;;; Goose constructors
;;; - default: no args
;;;   Postcondition: name == a default value. 
;;; - explicit1:
;;;   Receive: itsName, a String
;;;   Postcondition: name == itsName.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn make-Goose     
  ([]                (->Goose "Ann Onymous" "flew past"))
  ([^String itsName] (->Goose itsName "flew past"))
)


;;; method to retrieve a Goose's class
;;; Receive: this, a Goose object.
;;; Return: "Goose".
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defmethod getClass Goose [ _ ]
  "Goose"
)

;;; method to retrieve a Goose's call
;;; Receive: this, a Goose object.
;;; Return: "Honk!"
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defmethod getCall Goose [ _ ]
  "Honk!"
)

