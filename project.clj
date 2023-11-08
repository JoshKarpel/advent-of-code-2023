(defproject advent-of-code "0.1.0"
  :description "My Advent of Code 2023 solutions."
  :url "https://github.com/JoshKarpel/advent-of-code-2023"
  :dependencies [[org.clojure/clojure "1.10.2"]
                 [org.clojure/tools.trace "0.7.11"]
                 [cli-matic "0.5.4"]
                 [clj-http "3.12.3"]]
  :plugins [[dev.weavejester/lein-cljfmt "0.11.2"]]
  :main ^:skip-aot advent-of-code.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
:cljfmt {:sort-ns-references? true :parallel? true}
