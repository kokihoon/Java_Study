public class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("점프");
    }

    @Override
    public void display() {
        System.out.println("나타나기");
    }
}
