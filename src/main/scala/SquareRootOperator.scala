package com.knoldus

class SquareRootOperator extends Operator {
  override def validate(operands: Seq[Double]): Boolean = operands.length == 1

  override protected def execute(operands: Seq[Double]): Seq[Double] = {
    Seq(math.pow(operands(0),0.5))
  }
}
