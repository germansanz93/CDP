import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        //If two instances shows different values, there are two Singleton instances. If not, we are OK and there is only 1 instance.
        Singleton singleton = Singleton.getInstance("IAmTheOnlyOne");
        Singleton singleton1 = Singleton.getInstance("NoYouAreNot");
        System.out.println(singleton.value);
        System.out.println(singleton1.value);
    }
}