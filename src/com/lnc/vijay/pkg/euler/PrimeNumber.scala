package com.lnc.vijay.pkg.euler

trait PrimeNumber {

  def isPrime(x: Long): Boolean = {
    var counter = 2L;
    while (counter <= Math.sqrt(x)) {
      var result = factor(x, counter)
      if (result._2 != 0) return false;
      counter += 1;
    }
    return true;
  }

  def factor(x: Long, y: Long): Tuple2[Long, Long] = {
    var quotient = (x / y)
    if (x % y == 0)
      return Tuple2(y, quotient)
    return (0, 0)
  }

}