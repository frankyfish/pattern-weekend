package patterns.factory.abstrct;

import patterns.factory.abstrct.elements.ControlBar;
import patterns.factory.abstrct.elements.Window;

/**
 * Abstract factory for building UI elements.
 */
public abstract class GUIFactory {
    public abstract ControlBar showControlBar();
    public abstract Window createWindow();
}
