package com.knoldus

class PowerOperator extends Operator {
  override def validate(operands: Seq[Double]): Boolean = operands.length == 2

  override protected def execute(operands: Seq[Double]): Seq[Double] = {
    Seq(power(operands(0),operands(1).toInt))
  }
  private def power(base: Double, exponent: Int): Double = {
    if (exponent == 0) 1
    else if (exponent < 0 ) 1 / power(base, -exponent)
    else base * power(base, exponent - 1)
  }
}
