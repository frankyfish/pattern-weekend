package patterns.facade;

public class Client {
    public static void main(String[] args) {
        String compiledCode = CompilerFacade.compileCode("my-java-code");
        System.out.println(compiledCode);
    }
}
