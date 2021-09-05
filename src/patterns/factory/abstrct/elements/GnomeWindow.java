package patterns.factory.abstrct.elements;

public class GnomeWindow implements Window {
    @Override
    public void draw() {
        System.out.println("Drawing Gnome window");
    }

    @Override
    public void position() {
        System.out.println("Positioning Gnome Window");
    }
}
