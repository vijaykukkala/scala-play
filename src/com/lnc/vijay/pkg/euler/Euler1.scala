package com.lnc.vijay.pkg.euler

object Euler1 {

    def main(args: Array[String]){
	    val f = for (i <- List.range(1, 1000) if ((i % 3 == 0) || (i % 5 == 0))) yield i
	    val sum = (0 /: f) (_+_)
	    println(sum)   
    }
    
}