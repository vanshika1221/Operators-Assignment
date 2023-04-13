package com.knoldus

class AdditionOperator extends Operator {
  override def validate(operands: Seq[Double]): Boolean = operands.length == 2

  override protected def execute(operands: Seq[Double]): Seq[Double] = {
    Seq(operands(0) + operands(1))
  }
}

