package factory;

import buttons.Button;

public abstract class BaseCreator {

    public void RenderWindow() {

        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
