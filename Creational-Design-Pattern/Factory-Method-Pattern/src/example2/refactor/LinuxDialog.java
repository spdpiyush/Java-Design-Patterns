package example2.refactor;

import example2.Button;
import example2.LinuxButton;

public class LinuxDialog extends Dialog{

    @Override
    protected Button createButton() {
        return new LinuxButton();
    }
}
