package com.knoldus

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.math.pow

class SquareTheExpression {
  def squareOfExpression(firstOperand: Double, secondOperand: Double): Future[String] = {
    Future {
      val leftExpression = pow((firstOperand + secondOperand), 2)
      val rightExpression = pow(firstOperand, 2) + pow(secondOperand, 2) + 2 * (firstOperand * secondOperand)
      if (leftExpression == rightExpression) "Equal" else "Not Equal"
    }
  }
}

