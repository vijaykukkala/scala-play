package com.lnc.vijay.pkg
import java.util.ArrayList

object HelloWorldObj {

  def main(args: Array[String]){
	  println("hello world")
	  
	  println("Max of 10,20: " + max(10, 20))
	  
	  val x = new ArrayList[String]();
	  
	  val strArray =  Array("zero", "one", "two")
	  
	  strArray.foreach(println)
	  
	  
	  val emptyArray = Array()
	  
	  println("EmptyArray.length:" + emptyArray.length)
	  
	  val p1 = new Point(2, 1)
	  val p2 = new Point(7, 5)
	  println("Slope of line containing points " + slope(p2, p1))
	  
	  println("factorial(0) = " + factorial(0))
	  println("factorial(1) = " + factorial(1))
	  println("factorial(2) = " + factorial(2))
	  println("factorial(3) = " + factorial(3))
	  println("factorial(4) = " + factorial(4))
	  println("factorial(5) = " + factorial(5))
  }
  
  def slope(p1: Point, p2:Point): Float = {
		  (p2.yc - p1.yc).toFloat/(p2.xc - p1.xc).toFloat
  }
  
  def max(x: Int, y: Int): Int = {
     if (x > y) x else y
  }
  
  def factorial(x:Int, total:Int = 1):Int = {
     if (x == 0) total else  factorial(x -1, total * x)
  }
}