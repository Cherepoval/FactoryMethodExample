package factory;

import buttons.Button;
import buttons.HtmlButton;

public class HtmlCreator extends BaseCreator {
    @Override
    public Button createButton() {

        return new HtmlButton();
    }
}
