public class Mocha extends CondimentDecorator { //Mocha는 Decorator이기 때문에 CondimentDecorator를 상속한다.

    Beverage beverage;
    //Wrapping 하고자 하는 음료를 저장하기 위한 Instance 변수

    public Mocha(Beverage beverage) {
        // Instance 변수를 감싸고자 하는 객체를 설정하기 위한 생성자
        this.beverage = beverage;
    }

    //데코레이터에서는 자기가 감싸고 있는 Component의 메소드를 호출한 결과에 새로운 기능을 더 함으로써 행동을 확장한다.
    @Override
    public String getDescription() {
        // Decorate하고 있는 객체에 작업을 Delegate한 다음, 그 결과에 ", Mocha"를 추가한 결과를 return 한다.
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        // Decorate 하고 있는 객체에 가격을 구하는 작업을 Delegate해서 음료 자체의 값을 구하고, Mocha 가격을 더해서 합을 return한다
        return .20 + beverage.cost();
    }
}
