package singleton;

public class Singleton {

    /* instance of this class */
    private static Singleton instance;

    /* constructor without parameters */
    private Singleton() {}

    /* get single instance of this class */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
