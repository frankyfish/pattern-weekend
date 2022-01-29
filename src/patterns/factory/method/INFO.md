## Factory Method
Define an interface for creating an object, but let subclasses
decide which class to instantiate.
Factory Method lets a class defer instantiation to subclasses.

In some factory variations it boils down to just a static factory method
which produces objects. The main Con here is that in this method one can 
control whether to create new objects or return existing ones.

Factory method allows to perform some object tuning before we return
it to the client.

In practice Factory pattern is rather broad term including multiple meanings,
here is description: https://refactoring.guru/design-patterns/factory-comparison

### Naming Confusion
1. Creation method (aka factory method or it's variation static factory method) - method that
   creates other objects.
2. Simple factory pattern - describes a class that has one creation method with a large conditional
   that based on method parameters chooses which product class to instantiate and then return.
3. Factory method - The Factory Method  is a creational design pattern that provides an interface for 
   creating objects but allows subclasses to alter the type of an object that will be created.
4. Abstract factory pattern - The Abstract Factory  is a creational design pattern that allows producing families
   of related or dependent objects without specifying their concrete classes.


Factory method relies on inheritance. If you make it static, you can no longer extend
it in subclasses, which defeats the purpose of the pattern. Static creational method is closer
to constructor. It can help when have several different constructors that have different purposes
but their signatures match. For instance, having both `Random(int max)` and `Random(int min)`

### A.K.A
Virtual Constructor

## Real-time examples
This design pattern has been widely used in JDK, such as
1. getInstance() method of java.util.Calendar, NumberFormat, and ResourceBundle
   uses factory method design pattern.
2. All the wrapper classes like Integer, Boolean etc, in Java uses this
   pattern to evaluate the values using valueOf() method.
3. java.nio.charset.Charset.forName(), java.sql.DriverManager#getConnection(),
   java.net.URL.openConnection(), java.lang.Class.newInstance(),
   java.lang.Class.forName() are some of ther example where factory method
   design pattern has been used.