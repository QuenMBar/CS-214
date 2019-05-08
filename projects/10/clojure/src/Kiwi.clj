;;;; Kiwi.clj provides an Kiwi "class".
;;;; 
;;;; Begun by: Prof. Adams, for CS 214 at Calvin College.
;;;; Completed by: Quentin Barnes
;;;; Date: May 7, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 

;; bring in 'Bird' (to be used as 'superclass')

(load "Bird")


;; define 'Kiwi' as 'subclass' of Bird

(defrecord Kiwi [^Bird name movement] )


;;; Kiwi constructors
;;; - default: no args
;;;   Postcondition: name == a default value. 
;;; - explicit1:
;;;   Receive: itsName, a String
;;;   Postcondition: name == itsName.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn make-Kiwi     
  ([]                (->Kiwi "Ann Onymous" "walked past"))
  ([^String itsName] (->Kiwi itsName "walked past"))
)


;;; method to retrieve a Kiwi's class
;;; Receive: this, a Kiwi object.
;;; Return: "Kiwi".
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defmethod getClass Kiwi [ _ ]
  "Kiwi"
)

;;; method to retrieve a Kiwi's call
;;; Receive: this, a Kiwi object.
;;; Return: "Whoo-hoo!"
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defmethod getCall Kiwi [ _ ]
  "Screech!"
)

