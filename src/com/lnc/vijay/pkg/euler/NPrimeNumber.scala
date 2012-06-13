package com.lnc.vijay.pkg.euler

/**
 * http://projecteuler.net/problem=7
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
object NPrimeNumber extends PrimeNumber{

  def main(args: Array[String]) {
    println(nPrime(10001))
  }
  
  def nPrime(n: Int): Long = {
    var primeNumber = 2L;
    var counter = 0;
    while (counter < n) {
      if (isPrime(primeNumber)) {
        counter += 1;
      }
      primeNumber += 1;
    }
    return primeNumber;
  }
}

