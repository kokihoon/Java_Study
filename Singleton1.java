public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();

    private Singleton1(){

    }
    static Singleton1 getInstance() {
        return singleton;
    }
}
