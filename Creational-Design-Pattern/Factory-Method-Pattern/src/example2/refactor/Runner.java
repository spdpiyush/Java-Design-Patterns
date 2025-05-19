package example2.refactor;

public class Runner {

    public static void main(String[] args) {

        String os = "linux";

        Dialog dialog;
        if (os.equalsIgnoreCase("mac")) {
            dialog = new MacDialog();
        }else if (os.equalsIgnoreCase("linux")) {
            dialog = new LinuxDialog();
        }else if (os.equalsIgnoreCase("windows")) {
            dialog = new WindowDialog();
        }else {
            throw new IllegalArgumentException("Invalid OS");
        }
        dialog.renderWindow();
    }
}
