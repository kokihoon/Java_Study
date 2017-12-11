public class Dog implements Animal {
    @Override
    public void cry() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("뒤로 가기");
    }

    @Override
    public void display() {
        System.out.println("슥삭");
    }
}
