package com.lnc.vijay.pkg.euler
import scala.collection.immutable.TreeMap
import scala.collection.immutable.TreeSet

/**
 * http://projecteuler.net/problem=8
 * 
 * Find the greatest product of five consecutive digits in the 1000-digit number.
 */
object Product {

  val inputStr = "73167176531330624919225119674426574742355349194934" +
			    "96983520312774506326239578318016984801869478851843" +
			    "85861560789112949495459501737958331952853208805511" +
			    "12540698747158523863050715693290963295227443043557" +
			    "66896648950445244523161731856403098711121722383113" +
			    "62229893423380308135336276614282806444486645238749" +
			    "30358907296290491560440772390713810515859307960866" +
			    "70172427121883998797908792274921901699720888093776" +
			    "65727333001053367881220235421809751254540594752243" +
			    "52584907711670556013604839586446706324415722155397" +
			    "53697817977846174064955149290862569321978468622482" +
			    "83972241375657056057490261407972968652414535100474" +
			    "82166370484403199890008895243450658541227588666881" +
			    "16427171479924442928230863465674813919123162824586" +
			    "17866458359124566529476545682848912883142607690042" +
			    "24219022671055626321111109370544217506941658960408" +
			    "07198403850962455444362981230987879927244284909188" +
			    "84580156166097919133875499200524063689912560717606" +
			    "05886116467109405077541002256983155200055935729725" +
			    "71636269561882670428252483600823257530420752963450"
  def main(args: Array[String]) {
    var offset = 5
    var items = inputStr.sliding(5,1).toList
    println(items.map(x => (0 /: x)(_.toInt + _.toInt)).max)
   
  }
 
 /**
  * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
  * a^2 + b^2 = c^2
  * For example, 32 + 42 = 9 + 16 = 25 = 52.
  * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  * Find the product abc.  
  * http://projecteuler.net/problem=9
  */
  def pythogoreanTriplet() {
     val f = List.range(1,1001)
     val triplets = for (i <-f; j <- f; k <-f; if ((square(i) + square(j) == square(k)) && (i + j + k == 1000))) yield (i, j, k)
     triplets.map(x => x._1 * x._2 * x._3).distinct        
  }
  def square(x: Int): Int = { x * x }
  
  
}