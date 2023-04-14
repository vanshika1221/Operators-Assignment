package com.knoldus

class FibonacciOperator extends Operator {
  override def validate(operands: Seq[Double]): Boolean = operands.length == 1

  override protected def execute(operands: Seq[Double]): Seq[Double] = {
    fibonacciNumbers(operands(0),0,1)
  }
   def fibonacciNumbers(count: Double, firstTerm: Double, secondTerm: Double): Seq[Double] = {
    if (count == 0) Seq()
    else if (count == 1) Seq(firstTerm)
    else Seq(firstTerm) ++ fibonacciNumbers(count - 1, secondTerm, firstTerm + secondTerm)
  }
}
