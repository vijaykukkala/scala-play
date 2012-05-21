package com.lnc.vijay.pkg.euler
import scala.collection.mutable.ListMap
import scala.collection.mutable.LinkedList
import scala.collection.mutable.HashSet

/*
 * http://projecteuler.net/problem=3
 * 
 * Calculate the largest prime factor of the number 600851475143 
 */
object PrimeFactor {

  def main(args: Array[String]) {
    
    val qNumber = 600851475143L

    var i = 2L
    var list = new HashSet[Long]
    var lastFound = 0L
    while (i < Math.sqrt(qNumber) || !list.contains(lastFound)) {
      var result = factor(qNumber, i)
      if (result._2 != 0) {
        result.productIterator foreach {
          (item: Any) => list.add(
              item match {case x:Long => x
                		  case _ =>  throw new ClassCastException})}
        lastFound = result._2
      }
      i += 1
    }

    println(list)
    println(list filter isPrime max)
  }

  def isPrime(x: Long): Boolean = {
    var i = 2L;
    while (i < Math.sqrt(x)) {
      var result = factor(x, i)
      if (result._2 != 0) return false;
      i += 1;
    }
    return true;
  }

  def factor(x: Long, y: Long): Tuple2[Long, Long] = {
    var quotient = (x / y)
    if (x % y == 0)
      return Tuple2(y, quotient)
    else return Tuple2(0, 0)
  }
}