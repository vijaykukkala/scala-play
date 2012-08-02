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
   
    println("max sliding sum:" + slidingSum)
   
    println("max palindrome between 100 and 1000" + maximumPalindrome(100, 1000));
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
  
 
  /**
   * http://projecteuler.net/problem=28
   * Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
   * 			21 22 23 24 25
   * 			20  7  8  9 10
   * 			19  6  1  2 11
   * 			18  5  4  3 12
   * 			17 16 15 14 13
   * It can be verified that the sum of the numbers on the diagonals is 101.
   * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
   */
  def spiralSum() {
    def f(x:Int) = 4 * square(x) - 6 * x + 6 // Vertices on the 4 corners = x^2 + (x^2 - x + 1) + (x^2 - 2x +2) + (x^2 -3x + 3)
    
    val fx= for(x <- 3 to 1001 by 2) yield f(x) 
    
    val sumFx = (1 /: fx)(_+_)
    
  }
  
  /**
   * http://projecteuler.net/problem=4
   * 
   * A palindromic number reads the same both ways. 
   * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
   * 
   * Find the largest palindrome made from the product of two 3-digit numbers.
   */
  def maximumPalindrome(start:Int, end:Int) {
     val f = List.range(start,end)
     val palindromeList = for (i <- f; j <- f if (isPalindrome(i, j))) yield i * j
     palindromeList.max
  }
  
  def isPalindrome(x:Int, y:Int): Boolean = {
    val result = x * y
    val rString = result.toString
    return rString.equals(rString.reverse)    
  }
  
  private def slidingSum: Int = {
    var offset = 5
    var items = inputStr.sliding(5,1).toList
    items.map(x => (0 /: x)(_.toInt + _.toInt)).max
  }
  
}