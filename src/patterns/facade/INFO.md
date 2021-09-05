## Facade
p175
Provide a unified interface to a set of interfaces in a subsystem. 
Facade defines a higher- level interface that makes the subsystem easier to use.

A common design goal is to minimize the communication
and dependencies between subsystems. One way to achieve this goal is to
introduce a facade object that provides a single,
simplified interface to the more general facilities of a subsystem.

Simply put here:
https://refactoring.guru/design-patterns/facade
https://refactoring.guru/design-patterns/facade/java/example

### Example
Subsystem contains classes such as Scanner, Parser, ProgramNode, BytecodeStream, and ProgramNodeBuilder
that implement the compiler.

To provide a higher-level interface that can shield clients from these classes,
the compiler subsystem also includes a Compiler class.
This class defines a unified interface to the compiler's functionality.
It glues together the classes that implement compiler functionality without hiding them completely

## Applicability
Use the Facade pattern when
* you want to provide a simple interface to a complex subsystem

* there are many dependencies between clients and the implementation classes
  of an abstraction. Introduce a facade to decouple the subsystem from clients
  and other subsystems,
  thereby promoting subsystem independence and portability.
  
* you want to layer your subsystems. Use a facade to define an entry point to each subsystem level.

## Consequences 
1. It shields clients from subsystem components;
2. It promotes weak coupling between the subsystem and its clients.
3. It doesn't prevent applications from using subsystem classes if they need to.
   Thus you can choose between ease of use and generality.
