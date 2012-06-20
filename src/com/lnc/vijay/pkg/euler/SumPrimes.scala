package com.lnc.vijay.pkg.euler
import scala.collection.immutable.Range
import scala.collection.mutable.MutableList

/**
 * http://projecteuler.net/problem=10
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
object SumPrimes extends PrimeNumber{

  def main(args: Array[String]) {
	  var primesList = MutableList[Long]();
	  new Range(2, 2000000, 1).foreach(arg => { if (isPrime(arg)) primesList += arg })
	  println(primesList.reduceLeft(_+_)) // reduceRight throws a Exception in thread "main" java.lang.StackOverflowError
	  
  }
}