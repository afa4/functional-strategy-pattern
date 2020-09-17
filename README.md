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