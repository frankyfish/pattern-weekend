package patterns.facade;

public class JavaCodeScanner implements Scanner {
    @Override
    public String scan(String code) {
        System.out.println("Scanning Java code");
        return code;
    }
}
