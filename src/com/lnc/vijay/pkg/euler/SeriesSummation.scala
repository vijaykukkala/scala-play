package com.lnc.vijay.pkg.euler

/**
http://projecteuler.net/problem=6
The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

 */
object SeriesSummation {

  def main(args: Array[String]) {
    
    var n = 101
    f = List.range(1,n)
    val squares = f.map(square(_))
    val sumOfSquares = (0 /: squares)(_+_)
    val sumOfnumbers = (0 /: f)(_+_)
    println ("difference: " + square(sumOfnumbers) - sumOfSquares)
  }
  
  def square(x: Int): Int = { x * x }
  
}