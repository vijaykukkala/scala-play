package com.lnc.vijay.pkg.euler
import scala.annotation.tailrec

/**
 * http://projecteuler.net/problem=16
 * 
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */
object TwoPowers {

  def main(args: Array[String]) {
	val twoPowers = power(1000)
    println("2^1000 = " + twoPowers)
	var sum = 0;	
	for(x <- twoPowers) {
	  sum += x.toString.toInt
	}
	println(sum)
  }
  
  def power(x:Int): String = {
    if (x == 1) "2" 
      else  doubleIt(power(x -1).toString) //Currently fails at 10000 adding @tailrec gives an error.
  }
  
  def doubleIt(x:String):String = {
    var result = ""
    var carryOn = ""
    for(digit <- x.reverse) {
      var sum = (digit.toString.toInt * 2 + digitize(carryOn)).toString
      var value = if (sum.length > 1) (sum.charAt(1) + result, sum.charAt(0).toString) else (sum +result, "")
      result = value._1
      carryOn = value._2
    }
    if (!carryOn.equals("")) result = carryOn + result
    result
  }
  
  private def digitize(carryOn: String): Int = {
    if (carryOn.equals("")) 0 else carryOn.toInt
  }
  

}