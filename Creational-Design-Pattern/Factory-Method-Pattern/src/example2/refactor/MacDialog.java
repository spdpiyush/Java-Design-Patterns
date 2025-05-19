package example2.refactor;

import example2.Button;
import example2.MacButton;

public class MacDialog extends Dialog{

    @Override
    protected Button createButton() {
        return new MacButton();
    }
}
