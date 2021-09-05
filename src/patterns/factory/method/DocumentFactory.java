package patterns.factory.method;
/*
Two major varieties.
 The two main variations of the Factory Method pattern are
 (1) the case when the Creator class is an abstract class and does
 not provide an implementation for the factory method it declares,

 (2) the case when the Creator is a concrete class and provides a default
  implementation for the factory method. It's also possible to have
  an abstract class that defines a default implementation,
   but this is less common.
 */

/**
 * Factory for producing {@link Document} objects.
 */
public abstract class DocumentFactory {

    //(1)
    /**
     * Factory method aka Virtual constructor.
     * Delegates instance creation to Concrete creator class.
     * @return abstract Document
     */
    public abstract Document createDocument();

    //(2)
    /**
     * Parameterized Factory method that provides
     * implementation and allows to
     * set default value that would be returned.
     *
     * Creates needed object without calling Concrete creator
     *
     * @param type class of the object to create
     * @return instance of {@link Document}
     */
    public static Document createDocument(String type) {
        if ("word".equals(type.toLowerCase())) {
            return new WordDocument();
        }
        throw new RuntimeException("Not Supported!");
    }

    public void processDocument() {
        System.out.println("Processing document...");
    }

}
