package example2.violation;

import example2.Button;
import example2.LinuxButton;
import example2.MacButton;
import example2.WindowsButton;

/**
 * -> Client code is tightly coupled to all the button types.
 * -> Breaks Open-Closed Principle.
 * -> Poor Separation of concerns.
 */
public class Runner {

    public static void main(String[] args) {

        String os = "mac";

        Button button;
        if (os.equalsIgnoreCase("mac")) {
            button = new MacButton();
        }else if (os.equalsIgnoreCase("windows")) {
            button = new WindowsButton();
        }else if (os.equalsIgnoreCase("linux")) {
            button = new LinuxButton();
        }else {
            throw new IllegalArgumentException("Unsupported os type is passed");
        }
        button.render();
    }
}
