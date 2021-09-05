## Pattern Description
p.90
Cool explanation: https://refactoring.guru/design-patterns/abstract-factory
Concrete Factories can also be single tones.

### Who creates concrete Factory instances after all?
* Client can(?). **The class of a concrete factory appears only once in an
application—that is, where it's instantiated.**
* App.Usually, the application creates a concrete factory object at the initialization stage.
Just before that, the app must select the factory type depending on the configuration or the environment settings.

Although concrete factories instantiate concrete products, signatures of their creation methods
must return corresponding abstract products.
This way the client code that uses a factory **doesn’t get coupled**
to the specific variant of the product it gets from a factory.

### Consequences
1. It isolates concrete classes. **Clients manipulate instances through their abstract interfaces.**
   The Abstract Factory pattern helps you control the classes of objects
   that an application creates. Because a factory encapsulates the
   responsibility and the process of creating product objects,
   it isolates clients from implementation classes.
   
2. It makes exchanging product families easy. **The class of a concrete factory appears only once in an
   application—that is, where it's instantiated.**
   It can use different product configurations simply by changing the concrete factory. Because an abstract
   factory creates a complete family of products, the whole product family changes at once.
   
3. It promotes consistency among products. When product objects in a family are designed to work together, it's
   important that an application use objects from only one family at a time.
   
4. Supporting new kinds of products is difficult.
   AbstractFactory interface fixes the set of products that can be created. Supporting new kinds of products
   requires extending the factory interface, which involves changing the AbstractFactory
   class and all of its subclasses.

### Implementation
1. Factories as singletons. An application typically needs only one
   instance of a ConcreteFactory per product family. See Singleton.
2. Creating the products. AbstractFactory only declares an interface
   for creating products. It's up to ConcreteProduct subclasses to
   actually create them. The most common way to do this is to define
   a factory method (see Factory Method (107))
   
### Related
* Factory Method
* Prototype
* Singleton