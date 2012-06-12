package com.lnc.vijay.pkg
import java.util.ArrayList
import scala.collection.mutable.HashSet

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
	  
	  for(i <- 0 to 5)
	  println("factorial(" + i + ") = " + factorial(i))
	  
	  
	  var pointSet = HashSet(new Point(4, 5), new Point(4, 7), new Point(4, 1), new Point(4, 9), new Point(4, 8),
	      new Point(3, 5),  new Point(3, 7), new Point(3, 1), new Point(3, 9),  new Point(3, 8))
	 
	  println(pointSet.size)
	  
	  pointSet += new Point(3,5)
	  
	  println(pointSet.size)
	  
	  println(pointSet.filter(_.xc ==3).maxBy(_.yc))
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