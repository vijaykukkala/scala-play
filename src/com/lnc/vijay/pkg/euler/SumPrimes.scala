package com.lnc.vijay.pkg.euler
import scala.collection.immutable.Range
import scala.collection.mutable.MutableList

/**
 * http://projecteuler.net/problem=10
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * Refactored to use the http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 * increased the jvm memory size
 */
object SumPrimes extends PrimeNumber{

  def main(args: Array[String]) {
      
      val rangeLimit = 2000000
	  var filtered = List.range(2, rangeLimit, 1)
	  
	  var sieve = filtered.head
	  var resultList = List[Int]()
	  
	  while(sieve <= Math.sqrt(rangeLimit)) {
	    resultList ::= sieve
	    filtered = filtered.filter(_% sieve != 0)
	    sieve = filtered.head	    
	  }
	  val sumResultList = (0L /: resultList) (_+_)
	  val sumFiltered = (0L /: filtered) (_+_)
	  println("Final Total: %d".format(sumFiltered + sumResultList))
  } 
}