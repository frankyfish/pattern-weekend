package patterns.factory.abstrct.elements;

public class KDEControlBar implements ControlBar {
    @Override
    public void show() {
        System.out.println("Showing KDE control bar");
    }
}
