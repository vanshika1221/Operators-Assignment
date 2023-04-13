package com.knoldus

class FactorialOperator extends Operator {
  override def validate(operands: Seq[Double]): Boolean = operands.length == 1

  override protected def execute(operands: Seq[Double]): Seq[Double] = {
    Seq(factorial(operands(0).toInt))
  }
  def factorial(number: Int): Int = {
    if (number == 0) 1
    else number * factorial(number - 1)
  }
}
