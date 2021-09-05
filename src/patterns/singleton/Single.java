package patterns.singleton;

/*

Relate Patterns:
benefits:
1. Controlled access to sole instance.
2. Reduced name space. (Replaces the usage of global variables).
3. Permits a variable number of instances.
     The pattern makes it easy to change your mind and allow more than one instance of the Singleton class.
     Moreover, you can use the same approach to control the number of instances that the application uses.

Abstract Factory, Builder, Prototype;
 */
public class Single {
    private static Single self;

    private Single() {
        System.out.println("In Single's constructor");
    }

    public static Single getInstance() {
        if (self == null) {
            self = new Single();
        }
        return self;
    }
/*
Inheritence and singleton in Java:
When you have a class A extends B, an instance of A essentially "includes" instance of B. So the very concept of inheritance is contrary to the singleton model.

Depending on what you need it for, I would consider using composition / delegation.
 (A would have a reference to the singleton, rather than extending its class).
 If you need inheritance for some reason, create an interface with the Singleton methods,
 have Singleton implement that interface, and then have another class also implement
 that interface, and delegate to the singleton for its implementation of the relevant methods.
   src: https://stackoverflow.com/questions/8549825/singleton-with-subclassing-in-java
 */
}
