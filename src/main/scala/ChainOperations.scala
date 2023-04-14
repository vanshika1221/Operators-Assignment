package com.knoldus

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class ChainOperations extends FibonacciOperator {
  // Filter odd numbers from a given sequence
  private def filterOdd(numbers: Seq[Double]): Seq[Double] = {
    numbers.filter(_ % 2 != 0)
  }

  // Chained operation on a single number - find fibonacci and then sum of odd numbers from the resulting sequence
  def chainOfOperations(numbers: Seq[Double]): Future[Double] = {
    Future {
      val fibonacciResult = numbers.map(number => fibonacciNumbers(number, 0, 1))
      val oddFibonacciResult = filterOdd(Seq(fibonacciResult).flatten.flatten)
      calculateAverage(oddFibonacciResult)
    }
  }

  // Calculate average of odd numbers obtained
  private def calculateAverage(numbers: Seq[Double]): Double = {
    if (numbers.isEmpty) 0
    else numbers.sum / numbers.length
  }

}

