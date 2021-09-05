package patterns.factory.abstrct.elements;

public class GnomeControlBar implements ControlBar {
    @Override
    public void show() {
        System.out.println("Showing Gnome Control Bar");
    }
}
