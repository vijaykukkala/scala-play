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
	  val primesList = for (i <- List.range(2, 2000000) if (isPrime(i))) yield i
	  println( (0 /: primesList)(_+_)) // reduceRight throws a Exception in thread "main" java.lang.StackOverflowError
	  									// some explanation is given here http://days2012.scala-lang.org/sites/days2012/files/bjarnason_trampolines.pdf
	  
  }
}