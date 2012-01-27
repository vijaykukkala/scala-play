package com.lnc.vijay.pkg

class Point(var xc: Int, var yc: Int) {
  
  def move(dx: Int, dy: Int) {
    xc = xc + dx
    yc = yc + dy
  }
  override def toString(): String = "(" + xc + ", " + yc + ")";
}