package com.lnc.vijay.pkg.euler

class Addition {

  def add(xs:String, ys:String):String = {
//    println("xs:" + xs + " ys:" +ys)
    val y = ys.grouped(1).toList.map(_.toInt)
    val x = xs.grouped(1).toList.map(_.toInt)
    val z = x zip y
//    println(z)
    val z1=z.map{case(a,b) => a+b}
//    println("z1=" +z1)
    val zr = z1.reverse
//    println("zr=" + zr)
    val zf =zr.map{var v,k,j= 0; x => {k = (x+v)/10; j =(x + v)%10; v=k; j}}
//    println("zf=" + zf)
    val result = ("" /: zf)(_.toString +""+_.toString).reverse
//    println(result)
    result
  }
}