public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresson1();
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $"+beverage.cost());


        Beverage beverage1 = new DarkRoast();
        System.out.println(beverage1.getDescription() + " $"+beverage1.cost());

        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    }
}
