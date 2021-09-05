package patterns.facade;

public class JavaByteCodeStream implements ByteCodeStream {
    @Override
    public String stream(String code) {
        System.out.println("Processing Java sources, preparing byte-code");
        return String.valueOf(code.hashCode());
    }
}
