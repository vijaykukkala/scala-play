package com.lnc.vijay.pkg.euler
import scala.collection.mutable.HashMap
import scala.collection.mutable.LinkedList

/* Calculate the sum of all even fibonacci numbers bellow 4 million */
object Fibonocci {

  val fMap = new HashMap[Int, Long] // used to store the Fibonocci already calcuated.

  val maxValue: Long = 4000000

  //Initialize
  fMap += 1 -> 1;
  fMap += 2 -> 2;

  def main(args: Array[String]) {
    var counter = 1;
    while (f(counter) >= 0) {
      counter += 1
    }
    println(fMap.values.filter(_ % 2 == 0).reduceRight(_ + _))
  }

  def f(x: Int): Long = {
    if (!fMap.contains(x)) {
      val result = f(x - 1) + f(x - 2)
      if (result < maxValue)
        fMap += x -> (result)
      else return -1
    }
    return fMap(x)
  }
}