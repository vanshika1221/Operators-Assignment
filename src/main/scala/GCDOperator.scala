package com.knoldus

class GCDOperator extends Operator {
  override def validate(operands: Seq[Double]): Boolean = operands.length == 2

  override protected def execute(operands: Seq[Double]): Seq[Double] = {
    Seq(gcd(operands(0), operands(1)))
  }

  private def gcd(a: Double, b: Double): Double = {
    if (b == 0) a else gcd(b, a % b)
  }
}
