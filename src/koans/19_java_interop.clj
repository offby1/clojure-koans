(meditations
  "You may have done more with Java than you know"
  (= String (class "warfare")) ; hint: try typing (javadoc "warfare") in the REPL

  "The dot signifies easy and direct Java interoperation"
  (= "SELECT * FROM" (.toUpperCase "select * from"))

  "But instance method calls are very different from normal functions"
  ;; how so?
  (= ["SELECT" "FROM" "WHERE"] (map (fn [s] (.toUpperCase s)) ["select" "from" "where"]))

  "Constructing might be harder than breaking"
  (= 10 (let [latch (java.util.concurrent.CountDownLatch. 10)]
          (.getCount latch)))

  "Static methods are slashing prices!"
  (== (apply * (repeat 10 2)) (Math/pow 2 10)))
