[GoF p31]
Delegation is a way of making composition as powerful
for reuse as inheritance. In delegation, two objects are
involved in handling a request: a receiving object
delegates operations to its delegate.
This is analogous to subclasses deferring requests to
parent classes.

### Example
For example, instead of making class Window a subclass of
Rectangle (because windows happen to be rectangular), the
Window class might reuse the behavior of Rectangle by
keeping a Rectangle instance variable and delegating 
Rectangle-specific behavior to it. In other words,
instead of a Window being a Rectangle, it would have
a Rectangle. Window must now forward requests to its
Rectangle instance explicitly, whereas before it
would have inherited those operations.

**The main advantage** of delegation is that it makes it easy to compose behaviors at run- time and to change the way they're composed. Our window can become circular at run- time simply by replacing its Rectangle instance with a Circle instance, assuming Rectangle and Circle have the same type.