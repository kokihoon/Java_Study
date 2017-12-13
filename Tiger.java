public class Tiger extends Animal1 {

    public Tiger() {
        cry = new BirdCry();
        fly = new FlyNoway();
    }

    public void display() {
        System.out.println("호랑이");
    }

}
