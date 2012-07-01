package com.lnc.vijay.pkg.euler

/**
 * http://projecteuler.net/problem=13
 * 
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers
 */
class Addition {

  def add(xs:String, ys:String):String = {
    val y = ys.grouped(1).toList.map(_.toInt)
    val x = xs.grouped(1).toList.map(_.toInt)
    val z = x zip y
    val z1=z.map{case(a,b) => a+b}
    val zf =z1.reverse.map{var v,k,j= 0; x => {k = (x+v)/10; j =(x + v)%10; v=k; j}}
    val result = ("" /: zf)(_.toString +""+_.toString).reverse
    result
  }
  
  /**
   * http://projecteuler.net/problem=20
   * 
   * n! means n  (n  1)  ...  3  2  1
   * 
   * For example, 10! = 10  9  ...  3  2  1 = 3628800,
   * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
   * 
   * Find the sum of the digits in the number 100!
   */
  def multiply(xs:String, m:Int): String = {
     val x = xs.grouped(1).toList
     val y = x.map(_.toInt).reverse.map{var v, k, j, temp = 0; z=> 
       							{temp = (z * m) + v; k = temp/10; j = temp % 10; v = k; j}}
    ("" /: y.reverse)(_+""+_)   
  }
}