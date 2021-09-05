package patterns.factory.method;

public class WordDocument extends Document {
    private final String content = "<blank Word document>";

    public WordDocument() {
        System.out.println("New Word Document created.");
    }

    @Override
    public void save() {
        System.out.println("Saving... Saved!");
    }

    public String getContent() {
        return this.content;
    }
}
