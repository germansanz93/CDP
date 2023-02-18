package singleton;

public final class Singleton {
    // The value must be declared volatile so that double check lock would work correctly
    private static volatile Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        /**
         * Using double-checked locking (DCL). It exists to prevent race condition between multiple threads that may attempt
         * to get Singleton instance at the same time, creatin separate instances as a result.
         *
         * It may seem that having the 'result' variable here is pointless. There is, however, a very important ceveat when
         * implementing double-checked locking in Java, which is solved by introducing this local variable.
         * */
        Singleton result = instance;
        if(result != null){
            return result;
        }
        synchronized (Singleton.class) {
            if(instance == null) {
                instance = new Singleton(value);
            }
        }
        return instance;
    }
}
