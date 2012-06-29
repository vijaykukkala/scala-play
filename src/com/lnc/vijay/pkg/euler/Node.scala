package com.lnc.vijay.pkg.euler
import scala.collection.mutable.MutableList
import scala.collection.mutable.HashMap

/**
 * http://projecteuler.net/problem=18
 */
class Node(val value: Int, val l: Node, val r: Node) {

  def this(value: Int) = this(value, null, null)

  def infix(list: MutableList[Int]) {
	canTraverse(l)
    list += value
    canTraverse(r)
	def canTraverse(n:Node) = { if (n != null) n.infix(list)}    // this can be done better - Option or else
  }
  
  def maxValue:Int = {
    if (l != null && r != null) {
    	value + Math.max(l.maxValue, r.maxValue)
    } else value
  } 
  
}

object Node{
  def apply(value:Int, l:Node, r:Node) = {
    new Node(value, l, r)
  }
  def apply(value:Int) = {
    new Node(value)
  }
  
  def apply(graphString:String) = {
    val lines = graphString.split("\n")
    var adjacencyList = new HashMap[Int, HashMap[Int, Node] ];
    var range = Range(lines.length - 1, -1, -1)
    for(i <- range) {
    	var line = lines(i)
    	var nodeSet = new HashMap[Int, Node]
    	adjacencyList += i -> nodeSet
    	val items = line.split(" ");
    	for(j <- 0 until items.length) {
    		var itemValue = items(j).trim().toInt;
    		println(itemValue)
    		 var node = if (i == lines.length -1) new Node(itemValue)
    		 				else new Node(itemValue, 
    		 				    adjacencyList.get(i + 1).get(j),
    		 				    adjacencyList.get(i + 1).get(j + 1))    			
    		nodeSet += j -> node
    	}
    	
    }
    var count = 0;
    for(i <- 0 until lines.length) {
      adjacencyList.get(i).foreach(x => {x.foreach(y => count += 1)})
    }
    println("Count: " + count)
    adjacencyList.get(0).get(0)
  }
  
}
