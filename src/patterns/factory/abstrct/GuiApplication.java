package patterns.factory.abstrct;

import patterns.factory.abstrct.elements.ControlBar;
import patterns.factory.abstrct.elements.Window;

/*
DE agnostic.
Represents a layer between client and Abstract factory.
Added to demonstrate how easy it is to switch from this or that
DE implementation.
 */
public class GuiApplication {

    private final GUIFactory factory;

    public GuiApplication(GUIFactory factory) {
        this.factory = factory;
        init();
    }

    private void init() {
        // working with abstract instances
        ControlBar controlBar = factory.showControlBar();
        controlBar.show();

        Window window = factory.createWindow();
        window.draw();
    }

}
