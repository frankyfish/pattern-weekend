package patterns.facade;

public class JavaCodeParser implements Parser {
    @Override
    public String parse(String s) {
        System.out.println("Parsing Java Code");
        return s;
    }
}
