package com.knoldus

class SumOperator extends Operator {
  override def validate(operands: Seq[Double]): Boolean = operands.length >= 0

  override protected def execute(operands: Seq[Double]): Seq[Double] = {
    def sum(numbers: Seq[Double]): Double = {
      def sumHelper(numbers: Seq[Double], accumulator: Double): Double = {
        if (numbers.isEmpty) accumulator
        else sumHelper(numbers.tail, accumulator + numbers.head)
      }
      sumHelper(numbers, 0)
    }
    Seq(sum(operands))
  }
}
