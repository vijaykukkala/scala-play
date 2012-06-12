package com.lnc.vijay.pkg

class Point(var xc: Int, var yc: Int) {
  
  def move(dx: Int, dy: Int) {
    xc = xc + dx
    yc = yc + dy
  }
  override def toString(): String = "(" + xc + ", " + yc + ")";
  
  override def equals(other:Any): Boolean = {
    other match {
      case other:Point => this.xc == other.xc && this.yc == other.yc
      case _ => false;
    }
  }
  override def hashCode(): Int = 37 * xc + 17 *yc
}
