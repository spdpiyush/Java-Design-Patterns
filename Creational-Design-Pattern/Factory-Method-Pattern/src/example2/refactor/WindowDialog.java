package example2.refactor;

import example2.Button;
import example2.WindowsButton;

public class WindowDialog extends Dialog{

    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
