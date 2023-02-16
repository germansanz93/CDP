import factory.Dialog;
import factory.HtmlDialog;
import factory.LinuxDialog;

public class Main {

    private static Dialog dialog;

    private final static String LINUX = "Linux";

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        System.out.println("system: " + System.getProperty("os.name"));
        String system = System.getProperty("os.name");
        if(system.equals(LINUX)){
            dialog = new LinuxDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}