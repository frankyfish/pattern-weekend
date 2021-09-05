GOF:p.306
https://refactoring.guru/design-patterns/visitor

With the Visitor pattern, you define two class hierarchies:
1. one for the elements being operated on (the Node hierarchy);
2. one for the visitors that define operations on the elements (the NodeVisitor hierarchy).

The main point here is that checking logic is separated from the objects it checks.
You create a new operation by adding a new subclass to the visitor class hierarchy.
As long as objects that need to be checked doesn't change,
we can easily add new criteria of checking by extending abstract visitor with new implementations.

## Applicability
* an object structure contains many classes of objects with differing interfaces, and you want
  to perform operations on these objects that depend on their concrete classes.
* many distinct and unrelated operations need to be performed on objects in an object structure,
  and you want to avoid "polluting" their classes with these operations.
  Visitor lets you keep related operations together by defining them in one class. 
  When the object structure is shared by many applications, use Visitor to put operations in just
  those applications that need them.
* the classes defining the object structure rarely change, but you often want to define new operations
  over the structure. Changing the object structure classes requires redefining the interface to all visitors,
  which is potentially costly. If the object structure classes change often, then it's probably better to define
  the operations in those classes.
  
## Participants
* Visitor - declares a Visit operation for each class of ConcreteElement in the object
  structure. The operation's name and signature identifies the class that sends the 
  Visit request to the visitor. That lets the visitor determine the concrete class of 
  the element being visited.
* Concrete Visitor - implements each operation declared by Visitor.
  Each operation implements a fragment of the algorithm defined for the corresponding
  class of object in the structure. ConcreteVisitor provides the context for the algorithm
  and stores its local state.
* Element - defines an Accept operation that takes a visitor as an argument.
* Concrete Element - implements an Accept operation that takes a visitor as an argument.
  Calls specific method of Visitor for execution.

## Collaboration
1. A client that uses the Visitor pattern must create a ConcreteVisitor object and
   then traverse the object structure, visiting each element with the visitor.
2. When an element is visited, it calls the Visitor operation that corresponds to its class.
   The element supplies itself as an argument to this operation to let the visitor
   access its state, if necessary.
   
## Consequences
### Pros
1. Open/Closed Principle. You can introduce a new behavior that can work with objects of different
   classes without changing these classes.
2. Single Responsibility Principle. You can move multiple versions of the same behavior
   into the same class.
3. A visitor object can accumulate some useful information while working with various objects.
   This might be handy when you want to traverse some complex object structure,
   such as an object tree, and apply the visitor to each object of this structure.
### Cons
1. You need to update all visitors each time a class gets added to or removed
   from the element hierarchy.
2. Visitors might lack the necessary access to the private fields and methods
   of the elements that they’re supposed to work with.

### Java Implementation
https://refactoring.guru/design-patterns/visitor/java/example