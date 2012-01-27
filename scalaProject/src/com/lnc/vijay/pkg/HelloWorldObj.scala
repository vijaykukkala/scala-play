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
  }
  
  def max(x: Int, y: Int): Int = {
     if (x > y) x else y
  }
}