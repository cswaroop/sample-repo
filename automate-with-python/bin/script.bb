(let [secretPassword (clojure.string/trimr (slurp "SecretPasswordFile.txt"))
      _              (println "Enter your password")
      typedPassword  (read-line)]
  (if (= typedPassword secretPassword)
    (do
      (print "Access granted")
      (when (= typedPassword "12345")
        (print "That password is one that an idiot puts on their luggage")))
    (print "Access denied")))
