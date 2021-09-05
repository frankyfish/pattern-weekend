package patterns.facade;

public class JavaCompiler implements Compiler {
    @Override
    public void compile() {
        System.out.println("Compiling Java Code...");
    }
}
