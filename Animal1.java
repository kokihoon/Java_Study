public abstract class Animal1{


    protected Fly fly;
    protected Cry cry;

    public Animal1() {

    }

    public void performCry() {
        cry.cry();
    }

    public void performFly() {
        fly.fly();
    }
    public abstract void display();

    public void move() {
        System.out.println("움직인다.");
    }

    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public Cry getCry() {
        return cry;
    }

    public void setCry(Cry cry) {
        this.cry =cry;
    }
}
