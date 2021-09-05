package patterns.factory.abstrct;

import patterns.factory.abstrct.elements.*;

/**
 * Concrete factory implementation.
 * Returns instances of Products of the same Family of Products.
 */
public class GnomeGUIFactory extends GUIFactory {

    @Override
    public ControlBar showControlBar() {
        System.out.println("Building Gnome Control Bar");
        return new GnomeControlBar();
    }

    @Override
    public Window createWindow() {
        System.out.println("Creating Gnome GUI window.");
        return new GnomeWindow();
    }

}
