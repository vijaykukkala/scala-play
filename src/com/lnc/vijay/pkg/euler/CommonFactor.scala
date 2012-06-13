package com.lnc.vijay.pkg.euler
/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 	What is the largest prime factor of the number 600851475143 ?
 */
object CommonFactor {

  def main(args: Array[String]) = {
    println(lcm(1, 1))
    var mylcm = 1L;
    for (i <- 1 to 20) { mylcm = lcm(i, mylcm) }
    println(mylcm)
  }

  def lcm(x: Long, y: Long) = { x * y / gcd(x, y) }

  def gcd(x: Long, y: Long): Long = {
    if (x == 0) return y
    if (y == 0) return x
    if (x < y) gcd(x, (y % x)) else gcd((x % y), y)
  }

}