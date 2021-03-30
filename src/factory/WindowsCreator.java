package factory;

import buttons.Button;
import buttons.WindowsButton;

public class WindowsCreator extends BaseCreator {
    @Override
    public Button createButton() {

        return new WindowsButton();
    }
}
