package logic.factory;

import logic.buttons.Button;
import logic.buttons.WindowsButton;

public class WindowsDialog extends Dialog  {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
