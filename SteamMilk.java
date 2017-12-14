public class SteamMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", SteamMilk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
