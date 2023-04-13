# Operators-Assignment

# Calculator

This is a simple calculator that can perform basic arithmetic operations like addition, subtraction, multiplication, and division along with some advanced operations like finding the square root, factorial, greatest common divisor, fibonacci series, and finding odd or even operands.
# Available Operations

    +: Add 2 operands
    -: Subtract second operand from first operand
    *: Multiply 2 operands
    /: Divide first operand by second operand
    ^: First operand should be multiplied second operand times/ first operand raised to second operator
    sqrt: Square root of the operand
    !: Factorial of the number
    sum: Add all the operands
    gcd: Greatest common divisor of two operands
    odd: All the odd operands
    even: All the even operands
    fibonacci: Fibonacci series till operand.
    
   # Implementation Details

The calculator consists of two traits: Validator and Operator. The Validator trait validates the operands for a specific operator, whereas the Operator trait validates and executes the operands.

The Calculator object exposes a calculate function that takes an operator and a sequence of operands as input and returns the result of the operation as a Future of a sequence of doubles.

# Method Details

## calculate
def calculate(operator: String, operands: Seq[Double]): Future[Seq[Double]]

This method takes an operator and a sequence of operands as input and returns the result of the operation as a Future of a sequence of doubles. The operator must be one of the available operations listed above. If the operator is not recognized, an exception will be thrown. If the operands are not valid for the operator, an exception will also be thrown.

## squareOfExpression
def squareOfExpression(firstOperand: Double, secondOperand: Double): String

This method checks if (firstOperand + secondOperand) ^ 2 == (firstOperand ^ 2) + (secondOperand ^ 2) + (2 * firstOperand * secondOperand). If true, it returns "Equal" else "Not Equal".

## find
def find(numbers: Seq[Double]): Future[Seq[Double]]

This method finds the numbers from the provided sequence whose factorial is greater than 6 ^ number.

## findAverageAfterChainingOperations
def findAverageAfterChainingOperations(numbers: Seq[Double]): Future[Double]

For each number in the numbers sequence, this method first finds the fibonacci then finds the odd numbers from the resulting sequence and then returns their sum. After performing the above operation on each number, it finds the average.
