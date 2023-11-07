(ns advent-of-code.core
  (:require [cli-matic.core :refer [run-cmd]])
  (:gen-class))

(defn get-input [{:keys [day aoc-session]}]
  (println "get-input" day aoc-session))

(defn solve [{:keys [day]}]
  (println "solve" day))

(def CONFIGURATION
  {:command "advent-of-code"
   :description "My solutions for Advent of Code 2023"
   :version "0.1.0"
   :subcommands [{:command "get-input"
                  :description "Downloads the input file for a given day"
                  :examples ["First example" "Second example"]
                  :opts [{:as "The day to retrieve input for"
                          :option "day"
                          :short 0
                          :default :present
                          :type :int}
                         {:as "AoC session token"
                          :option "aoc-session"
                          :default :present
                          :env "AOC_SESSION"
                          :type :string}]
                  :runs get-input}
                 {:command "solve"
                  :description "Runs the solution for a given day"
                  :opts [{:as "The day to solve"
                          :option "day"
                          :short 0
                          :default :present
                          :type :int}]
                  :runs solve}]})

(defn -main
  [& args]
  (run-cmd args CONFIGURATION))
