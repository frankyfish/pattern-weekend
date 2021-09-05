package patterns.factory.abstrct.elements;

public class KDEWindow implements Window {
    @Override
    public void draw() {
        System.out.println("Drawing KDE window");
    }

    @Override
    public void position() {
        System.out.println("Positioning KDE window");
    }
}
