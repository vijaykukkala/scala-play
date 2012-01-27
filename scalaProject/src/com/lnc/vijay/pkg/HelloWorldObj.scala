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
  }
  
  def slope(p1: Point, p2:Point): Float = {
		  (p2.yc - p1.yc).toFloat/(p2.xc - p1.xc).toFloat
  }
  
  def max(x: Int, y: Int): Int = {
     if (x > y) x else y
  }
}