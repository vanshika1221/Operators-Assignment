package com.knoldus

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Driver extends App {
  private val factorialObject = new FindFactorial
  private val factorialResult = factorialObject.find(Seq(2, 5, 6, 19))
  factorialResult.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"FindFactorial > 6 ^ number Result: $value")
  }

  private val averageObject = new ChainOperations
  private val averageResult = averageObject.chainOfOperations(Seq(2,4,6))
  averageResult.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"FindAverage after chaining Result: $value")
  }

  private val squareExpressionObject = new SquareTheExpression
  private val squareExpressionResult = squareExpressionObject.squareOfExpression(6, 2)
  squareExpressionResult.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Square of Expression Result: $value")
  }
  private val additionOperatorObject = Calculator.calculate("+", Seq(7, 2, 9))
  private val additionOperatorAnotherObject = Calculator.calculate("+", Seq(7, 2))
  private val subtractionOperatorObject = Calculator.calculate("-", Seq(7, 2))
  private val multiplicationOperatorObject = Calculator.calculate("*", Seq(17, 2))
  private val divisionOperatorObject = Calculator.calculate("/", Seq(14, 2))
  private val powerOperatorObject = Calculator.calculate("^", Seq(6, 3))
  private val squareRootOperatorObject = Calculator.calculate("sqrt", Seq(49))
  private val factorialOperatorObject = Calculator.calculate("!", Seq(8))
  private val sumOperatorObject = Calculator.calculate("sum", Seq(7, 2, 9, 8))
  private val gcdOperatorObject = Calculator.calculate("gcd", Seq(12, 3))
  private val oddOperatorObject = Calculator.calculate("odd", Seq(7, 2, 9, 4, 11, 68))
  private val evenOperatorObject = Calculator.calculate("even", Seq(7, 2, 9, 4, 11, 68))
  private val fibonacciOperatorObject = Calculator.calculate("fibonacci", Seq(5))
  private val equalOperatorObject = Calculator.calculate("=", Seq(5, 9))

  additionOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Addition Result: $value")
  }
  additionOperatorAnotherObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Addition Result: $value")
  }
  subtractionOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Subtraction Result: $value")
  }
  multiplicationOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Multiplication Result: $value")
  }
  divisionOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Division Result: $value")
  }
  powerOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Power Result: $value")
  }
  squareRootOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Square Root Result: $value")
  }
  factorialOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Factorial Result: $value")
  }
  sumOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Sum Result: $value")
  }
  gcdOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"GCD Result: $value")
  }
  oddOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Odd Result: $value")
  }
  evenOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Even Result: $value")
  }
  fibonacciOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Fibonacci Result: $value")
  }
  equalOperatorObject.onComplete {
    case Failure(exception) => println(s"${exception.getMessage}")
    case Success(value) => println(s"Equal Result: $value")
  }
}