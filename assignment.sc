import math.{sqrt,pow}

object Caseclass {
  val P1 = new Point(2,8)
  val P2 = new Point(1,3)
  val P3 = P1.move(1,9)
  val P4 = new Point(2,4)
  val dist = P1.distance(P2)

  println(f "Distance = ${dist}%.2f" )
  println(P1)
  println(P2)
  println(s "Addition = ${P1+P2}" )
  println(s "Invert = ${P4.invert()}" )
}

case class Point(a:Int, b:Int) {
  def x:Int = a
  def y:Int = b

  def move (dx:Int, dy:Int) = Point(this.x+dx,this.y+dy)
  
  def +(that:Point) = Point(this.x+that.x, this.y+that.y)
  
  def distance (other:Point):Double = sqrt(pow(this.x - other.x, 2) + pow(this.y - other.y, 2))
  
  def invert() = Point(this.y,this.x)
}

