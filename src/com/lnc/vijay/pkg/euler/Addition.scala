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
}