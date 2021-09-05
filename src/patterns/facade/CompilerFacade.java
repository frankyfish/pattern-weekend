package patterns.facade;

public class CompilerFacade {
    /**
     * Represents a facading method which performs calls to several
     * sub-systems in order to provide a simplified API to the client.
     *
     * Code compilation includes work of several underlying systems.
     * @param code code to `compile`
     * @return `compiled` code
     */
    public static String compileCode(String code) {
        JavaCodeParser javaCodeParser = new JavaCodeParser();
        javaCodeParser.parse(code);

        JavaCodeScanner javaCodeScanner = new JavaCodeScanner();
        javaCodeScanner.scan(code);

        JavaCompiler javaCompiler = new JavaCompiler();
        javaCompiler.compile();

        JavaByteCodeStream javaByteCodeStream = new JavaByteCodeStream();

        return javaByteCodeStream.stream(code);
    }

}
