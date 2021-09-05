package patterns.factory.method;

public class Client {
    public static void main(String[] args) {
        // using concrete creator impl
        DocumentFactory application = new WordApplication();
        Document document = application.createDocument();
        System.out.println("Document's content: " + document.getContent());
        document.save();
        application.processDocument();

        // using Factory's impl
        Document wordDocument = DocumentFactory.createDocument("word");
        System.out.println("Document's content: " + wordDocument.getContent());
        wordDocument.save();
    }
}
