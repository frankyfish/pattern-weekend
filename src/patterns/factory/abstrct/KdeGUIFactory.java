package patterns.factory.abstrct;

import patterns.factory.abstrct.elements.ControlBar;
import patterns.factory.abstrct.elements.KDEControlBar;
import patterns.factory.abstrct.elements.KDEWindow;
import patterns.factory.abstrct.elements.Window;

/**
 * Concrete factory implementation.
 * Returns instances of Products of the same Family of Products.
 */
public class KdeGUIFactory extends GUIFactory {
    @Override
    public ControlBar showControlBar() {
        System.out.println("Creating KDE Control Bar");
        return new KDEControlBar();
    }

    @Override
    public Window createWindow() {
        System.out.println("Creating KDE window.");
        return new KDEWindow();
    }
}
