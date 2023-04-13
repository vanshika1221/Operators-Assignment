package com.knoldus
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class AverageCalculator {
  // Calculate the average of the given numbers sequence
  def calculate(numbers: Seq[Double]): Double = {
    if (numbers.isEmpty) 0
    else numbers.sum / numbers.length
  }
}

class ChainOperations {
  // Fibonacci sequence
  private def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  // Filter odd numbers from a given sequence
  private def filterOdd(numbers: Seq[Int]): Seq[Int] = {
    numbers.filter(_ % 2 != 0)
  }
  // Chained operation on a single number - find fibonacci and then sum of odd numbers from the resulting sequence
  private def chainOfOperations(number: Double): Future[Int] = {
    Future {
      val fibonacciResult = fibonacci(number.toInt)
      val oddFibonacciResult = filterOdd(Seq(fibonacciResult))
      oddFibonacciResult.sum
    }
  }
  def findAverageAfterChainingOperations(numbers: Seq[Double]): Future[Double] = {
    val averageCalculator = new AverageCalculator()

    Future.sequence(numbers.map(chainOfOperations))
      .map(_.map(_.toDouble))
      .map(averageCalculator.calculate)
  }
}

