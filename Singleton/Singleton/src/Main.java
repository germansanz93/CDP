import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        //If two instances shows different values, there are two Singleton instances. If not, we are OK and there is only 1 instance.
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());
        thread1.start();
        thread2.start();
    }

    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("IAmTheOnlyOne");
            System.out.println(singleton.value);
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            Singleton singleton1 = Singleton.getInstance("NoYouAreNot");
            System.out.println(singleton1.value);
        }
    }
}