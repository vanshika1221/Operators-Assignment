package com.knoldus

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class ChainOperations {
  // making objects of odd , fibonacci and sum operators to use their functionality further here
  private val oddObject = new OddOperator
  private val fibonacciObject = new FibonacciOperator
  private val sumObject = new SumOperator

  // Chained operation on a single number - find fibonacci and then sum of odd numbers from the resulting sequence
  def chainOfOperations(numbers: Seq[Double]): Future[Double] = {
    Future {
      val fibonacciResult = numbers.map(number => fibonacciObject.fibonacciNumbers(number, 0, 1))
      val oddFibonacciResult = oddObject.validateAndExecute(Seq(fibonacciResult).flatten.flatten)
      calculateAverage(oddFibonacciResult)
    }
  }
  // Calculate average of odd numbers obtained
  private def calculateAverage(numbers: Seq[Double]): Double = {
    if (numbers.isEmpty) 0
    else sumObject.sumOfNumbers(numbers) / numbers.length
  }
}

