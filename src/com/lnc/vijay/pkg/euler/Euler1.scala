package com.lnc.vijay.pkg.euler

object Euler1 {

    def main(args: Array[String]){

    val f = for (i <- List.range(1, 1000) if (factor(i, 3) || factor(i, 5))) yield i
    val sum = (0 /: f) (_+_)
    println(sum)
      
    }
    
    def factor(x: Int, y: Int): Boolean = {
     (x / y) * y == x
    }
}