package patterns.delegate;

public class Client {
    public static void main(String[] args) {
        WindowsWindow windowsWindow = new WindowsWindow();
        windowsWindow.render();
    }
}
