# Payment System Console Application

This is a Java console application demonstrating key OOP concepts such as **method overloading** and **method overriding** through a simple payment system.

## Project Overview

- **Method Overloading**  
  Demonstrates different ways to process payments using the `PaymentProcessor` class:
  - Process payment with a single amount.
  - Process payment with amount plus an additional percentage fee.

- **Method Overriding**  
  Shows polymorphism via the base class `PaymentMethod` and its subclasses:
  - `CardPayment`
  - `CashPayment`
  - `OnlinePayment`  
  Each subclass overrides the `displayStatus()` method to print specific payment status messages.

- **Interactive Payment Process**  
  Allows the user to:
  - Enter a payment amount.
  - Choose a payment method (Card, Cash, Online).
  - See the corresponding payment status and confirmation.

## How to Run

1. Make sure you have Java installed.
2. Compile all Java files in the `odenishSistemiApp` package.
3. Run the `PaymentMain` class.
4. Follow the on-screen prompts to simulate payment processing.

## Sample Output

--- Payment System ---
--- Part A: Method Overloading Check ---
Sale #1: 150.75 AZN total payment processed.
Sale #2: 200.0 AZN payment (with 5.0% extra) processed as a total of 210.0 AZN.

--- Part B: Method Overriding Check ---
Card payment status: Card reader is active, waiting for PIN code.
Cash payment status: Cash received, change should be returned.
Online payment status: Confirmation link sent, waiting for response.
General method status: Payment method status is unknown.

--- Interactive Payment Process ---
Please enter the payment amount (positive number): 150.75
Select payment method:
1 - Card
2 - Cash
3 - Online
Enter your choice: 1

Payment process starting...
Card payment status: Card reader is active, waiting for PIN code.
150.75 AZN total payment transaction executed.
