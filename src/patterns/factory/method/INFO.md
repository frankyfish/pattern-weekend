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