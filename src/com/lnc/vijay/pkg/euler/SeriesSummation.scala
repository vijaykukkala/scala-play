package com.lnc.vijay.pkg.euler

/**
http://projecteuler.net/problem=6
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

 */
object SeriesSummation {

  def main(args: Array[String]) {
    
    var n = 100
    println("Square of Sum of 10: " + square(sum(n, {x => x})))
    println("Sum of squares of 10: " + sum(n, square))
    println ("difference: " + (square(sum(n, {x => x})) - sum(n, square)))
  }
  
  def square(x: Int): Int = { x * x }
  
  def sum(maxValue: Int, callback : Int => Int): Int = {
    var sumOfSeries = 0
    if (maxValue > 0) {
	    var counter = 1
	    while (counter <= maxValue) {
	      sumOfSeries += callback(counter)
	      counter += 1;
	    }
    }
    sumOfSeries;
  }
}