package patterns.factory.method;

/**
 * Concrete Creator of document {@link WordDocument}
 */
public class WordApplication extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
