public abstract class Beverage {
    String description = "";

    public String getDescription() {

        return description;
    }

    //SubClass에서 구형해야됨.
    public abstract double cost();
}

