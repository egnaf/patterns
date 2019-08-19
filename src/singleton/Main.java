package singleton;

public class Main {

    public static void main(String[] args) {

        /* create instance of the Singleton class */
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1); // singleton.Singleton@610455d6
        System.out.println(singleton2); // singleton.Singleton@610455d6
    }
}
