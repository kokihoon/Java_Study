public class PlayAnimal {

    public static void main(String[] args) {
        Animal1 tiger = new Tiger();
        tiger.performCry();
        tiger.display();
        tiger.performFly();

        System.out.println("-------------------------------");
        Animal1 eagle = new Eagle();
        eagle.performFly();
        eagle.performCry();
        eagle.display();

        System.out.println("-------------------------------");

        Animal1 turtle = new Turtle();
        turtle.display();
        turtle.performCry();
        turtle.performFly();
    }
}
