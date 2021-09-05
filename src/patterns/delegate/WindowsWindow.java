package patterns.delegate;

/**
 * Represents a window object.
 * This class is using composition(at least the weak one)
 * because it contains reference to an object of type {@link Rectangle}
 * from which the shape is derived.
 */
public class WindowsWindow implements Window {

    /**
     * Delegate object from which the shape is derived.
     */
    private final Rectangle delegate;

    public WindowsWindow() {
        this.delegate = new Rectangle();
    }

    /**
     * Represents a delegate method.
     */
    @Override
    public void render() {
        System.out.println("Building window...");
        System.out.println("Deriving shape...");
        delegate.draw();
        System.out.println("Decorating the rectangle...");
        System.out.println("Done");
    }
}
