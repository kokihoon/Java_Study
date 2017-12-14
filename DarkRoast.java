public class DarkRoast extends Beverage { //음료를 구현하기 위해 Beverage 클래스를 상속한다.

    public DarkRoast() {
        description = "DarkRoast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
        //음료 클래스에서는 첨가물 가격을 걱정할 필요가 없다.
        // 그냥 DarkRoast의 가격을 리턴하면 된다.
    }
}
