package com.knoldus

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class SquareTheExpression extends PowerOperator {
  def squareOfExpression(firstOperand: Double, secondOperand: Double): Future[String] = {
    Future {
      val leftExpression = power((firstOperand + secondOperand),2)
      val rightExpression = power(firstOperand,2) + power(secondOperand,2) + 2 * (firstOperand * secondOperand)
      if (leftExpression == rightExpression) "Equal" else "Not Equal"
    }
  }
}

