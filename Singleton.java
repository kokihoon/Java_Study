public class Singleton {

    private static Singleton singleton = null;
    private int single;

    private Singleton() {
        single = 5;
    }

    public static Singleton getInstance() {

        if(singleton == null) {
            singleton = new Singleton();
            System.out.println("새로 생성");
        }

        else{
            System.out.println("이미 있다");
        }
        return singleton;
    }

    public void setSingle(int single) {
        this.single = single;
    }

    public int getSingle() {
        return single;
    }
}
