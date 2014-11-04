(ns clojure-fun.core-test
  (:require [clojure.test :refer :all]
            [clojure-fun.core :refer :all]))

(deftest sum-test 
  (testing "sum of numbers"
    (is (= (sum 1 5) 6))))

