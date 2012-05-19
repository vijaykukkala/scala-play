package com.lnc.vijay.pkg.euler

object Euler1 {

    def main(args: Array[String]){
      val range = 1.until(1000)
      var sum = 0
      for (i <- range) {
        if (factor(i, 3) || factor(i, 5)) {
          sum += i;
        }       
      }
      println(sum)     
      
    }
    
    def factor(x: Int, y: Int): Boolean = {
     (x / y) * y == x
    }
}