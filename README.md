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
