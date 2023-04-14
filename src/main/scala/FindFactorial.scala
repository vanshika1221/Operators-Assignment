package com.knoldus

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.math.pow

class FindFactorial extends FactorialOperator {
  def find(numbers: Seq[Double]): Future[Seq[Double]] = {
    Future {
      numbers.filter(number => factorial(number.toInt) > pow(6, number))
    }
  }
}
