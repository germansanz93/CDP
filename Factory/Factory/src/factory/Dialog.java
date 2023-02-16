package factory;

import buttons.Button;

/**
 * Base Factory class. It should have some core business logic which needs differents products to be created.
 * */
public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
