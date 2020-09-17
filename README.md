## Strategy pattern

Class behavior is injected, so its possible to have
multiple instances of the same class with different
method implementations.

Isn't necessary to create class inheritance to define
a specific logic to a specific instance.

The algorithm varies independently of the 'client'
(class) that uses it

## Imperative x Functional

In general, specially when you used to be a java dev,
its normal to implement this pattern using interfaces
and inheritance.

Kotlin first order functions enables the strategy
implementation without need of this traditional stuff.

You can just inject the behavior as a function reference
direct on the constructor.

## Code

- [Base class](src/main/kotlin/Duck.kt)
- [Strategies](src/main/kotlin/QuackStrategies.kt)
- [Example](src/main/kotlin/Main.kt)

## References

- [Strategy Pattern – Design Patterns (ep 1)](https://www.youtube.com/watch?v=v9ejT8FO-7I)
- [Strategy pattern in functional programming](https://medium.com/@itachi.hasegawa/strategy-pattern-in-functional-programming-38ddcc2b2d50)
