package com.lnc.vijay.pkg.euler
import scala.collection.mutable.ListMap
import scala.collection.mutable.LinkedList
import scala.collection.mutable.HashSet

/*
 * http://projecteuler.net/problem=3
 * 
 * Calculate the largest prime factor of the number 600851475143 
 */
object PrimeFactor extends PrimeNumber{

  def main(args: Array[String]) {
    
    val qNumber = 600851475143L
    
    val factorSet = calculateFactorList(qNumber)

    println(factorSet)
    
    println(factorSet filter isPrime max)
  }

  

  private def calculateFactorList(qNumber: Long): HashSet[Long] = {

    var counter = 2L
    var factorSet = new HashSet[Long]
    var lastFound = 0L
    while (counter < Math.sqrt(qNumber) || !factorSet.contains(lastFound)) {
      var result = factor(qNumber, counter)
      if (result._2 != 0) {
        result.productIterator foreach {
          (item: Any) => factorSet.add(
              item match {case x:Long => x
                		  case _ =>  throw new ClassCastException})}
        lastFound = result._2
      }
      counter += 1
    }
    factorSet
  }
}