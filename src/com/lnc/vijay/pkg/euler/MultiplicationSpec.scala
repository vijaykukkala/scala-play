package com.lnc.vijay.pkg.euler

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MultiplicationSpec extends FlatSpec {

  def operation = new Addition
  
  "Multiply Operation" must "multiply two numbers" in {
    val result = operation.multiply("0026", 7)
    assert("0182" equals result)
  }

  it must "multiply two numbers 26 and 27 " in {
    val result = operation.multiply("0026", 27)
    assert(26*27 == result.toInt)
  }
  
  it must "multiply two numbers 262727262724323424 and 4 " in {
    val result = operation.multiply("00262727262724323424", 4)
    assert("01050909050897293696" equals result)
  }
  
  it must "find Factorial of numbers upto 10" in {
    var result =  "01"
    for(i <- 1 to 10) {
      result = operation.multiply("0" + result, i)
    }
    var expected = (1 /: List.range(1, 11))(_*_)
    assert(expected == result.toInt)
  }
  
  it must "find Factorial of numbers upto 100" in {
    var result =  "01"
    for(i <- 1 to 100) {
      result = operation.multiply("00" + result, i)      
    }
    println(result)
    println("sum of digits:" + result.grouped(1).toList.map(_.toInt).sum)
    
  }
  
}