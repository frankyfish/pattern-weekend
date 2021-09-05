package patterns.factory.abstrct;

import patterns.factory.abstrct.elements.ControlBar;
import patterns.factory.abstrct.elements.Window;

public class ClientOfAbstractFactory {
    public static void main(String[] args) {
        // during start-up of the app(env.vars)
        // OR client defines by creating instance of needed factory
        // Corresponding Concrete Factory is loaded.
        GUIFactory factory = new GnomeGUIFactory();
        // GuiApp can be easily switched to either DE: KDE, Gnome
        new GuiApplication(factory);

        /*
        // Client is working with abstract Product instances
        Window window = factory.createWindow();
        window.draw();

        ControlBar controlBar = factory.showControlBar();
        controlBar.show();
         */
    }
}
