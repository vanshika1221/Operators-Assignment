package com.knoldus

class DivisionOperator extends Operator {
  override def validate(operands: Seq[Double]): Boolean = operands.length == 2 && operands(1) != 0

  override protected def execute(operands: Seq[Double]): Seq[Double] = {
    Seq(operands(0) / operands(1))
  }
}
