package com.knoldus

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

trait Validator {
  // validate the operands for the specific operator
  def validate(operands: Seq[Double]): Boolean
}

trait Operator extends Validator {
  // validate and execute - implement this function in trait
  // this function will validate the operands for the provided operator and execute it.
  // throw CalculatorException when validation fails.
  def validateAndExecute(operands: Seq[Double]): Seq[Double] = {
    if (validate(operands)) {
      execute(operands)
    } else {
      throw new CalculatorException(s"Validation failed of ${getClass.getName}")
    }
  }

  protected def execute(operands: Seq[Double]): Seq[Double]
}

// exception class for calculator errors
class CalculatorException(message: String) extends Exception(message)

object Calculator {
  // main calculator function to be called from outside
  def calculate(operator: String, operands: Seq[Double]): Future[Seq[Double]] = {
    operator match {
      case "+" => execute(new AdditionOperator, operands)
      case "-" => execute(new SubtractionOperator, operands)
      case "*" => execute(new MultiplicationOperator, operands)
      case "/" => execute(new DivisionOperator, operands)
      case "^" => execute(new PowerOperator, operands)
      case "sqrt" => execute(new SquareRootOperator, operands)
      case "!" => execute(new FactorialOperator, operands)
      case "sum" => execute(new SumOperator, operands)
      case "gcd" => execute(new GCDOperator, operands)
      case "odd" => execute(new OddOperator, operands)
      case "even" => execute(new EvenOperator, operands)
      case "fibonacci" => execute(new FibonacciOperator, operands)
      case _ => Future.failed(new CalculatorException("Invalid operator"))
    }
  }

  // helper function to execute the operator in a Future
  private def execute(operator: Operator, operands: Seq[Double]): Future[Seq[Double]] = {
    Future {
      operator.validateAndExecute(operands)
    }
  }
}
