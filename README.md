# Java Design Patterns

This project explore the various design patterns in Java.

## Strategy pattern

This pattern defines a family of algorithms, encapsulate each one, and makes them interchangeable. This lets the algorithm vary independetly from clients that use it.
The underlying principle is programming to an interface. The pattern is implemented by creating an Algorithmic interface implemented by a set of Algorithmic classes.
The Algorithmic interface is then defined as a variable in the superclass and the subclasses can switch between its varying implementations thus providing code reuse
that would otherwise involve a lot of code duplication in a usual inheritance design.
