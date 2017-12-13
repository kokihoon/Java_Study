public class Turtle extends Animal1{


    public Turtle() {
        cry = new CryNoWay();

        fly = new FlyNoway();
    }
    @Override
    public void display() {
        System.out.println("꺼북꺼북");
    }
}
