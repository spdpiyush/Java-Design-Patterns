package example2.refactor;

import example2.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    // Factory Method
    protected abstract Button createButton();
}
