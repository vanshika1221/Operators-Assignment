package com.knoldus

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.math.pow

class FindFactorial {
  def factorial(number: Int): Int = {
    if (number == 0) 1
    else number * factorial(number - 1)
  }

  def find(numbers: Seq[Double]): Future[Seq[Double]] = {
    Future {
      numbers.filter(number => factorial(number.toInt) > pow(6, number))
    }
  }
}
