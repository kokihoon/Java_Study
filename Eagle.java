public class Eagle extends Animal1 {


    @Override
    public void display() {
        System.out.println("독수리");
    }

    public Eagle() {
        cry = new BirdCry();

        fly = new FlyHighWings();
    }
}
