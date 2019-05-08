;;;; Ostrich.clj provides an Ostrich "class".
;;;; 
;;;; Begun by: Prof. Adams, for CS 214 at Calvin College.
;;;; Completed by: Quentin Barnes
;;;; Date: May 7, 2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 

;; bring in 'Bird' (to be used as 'superclass')

(load "Bird")


;; define 'Ostrich' as 'subclass' of Bird

(defrecord Ostrich [^Bird name movement] )


;;; Ostrich constructors
;;; - default: no args
;;;   Postcondition: name == a default value. 
;;; - explicit1:
;;;   Receive: itsName, a String
;;;   Postcondition: name == itsName.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn make-Ostrich     
  ([]                (->Ostrich "Ann Onymous" "walked past"))
  ([^String itsName] (->Ostrich itsName "walked past"))
)


;;; method to retrieve a Ostrich's class
;;; Receive: this, a Ostrich object.
;;; Return: "Ostrich".
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defmethod getClass Ostrich [ _ ]
  "Ostrich"
)

;;; method to retrieve a Ostrich's call
;;; Receive: this, a Ostrich object.
;;; Return: "Whoo-hoo!"
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defmethod getCall Ostrich [ _ ]
  "Snork!"
)

