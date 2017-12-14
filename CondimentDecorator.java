public abstract class CondimentDecorator extends Beverage { // 커피의 첨가물을 나타내는 Abstract 클래스 (Decorator 클래스)
    //데코레이터 클래스의 형식은 그 클래스가 감싸고 있는 클래스의 형식을 반영한다.
    public abstract String getDescription();
}
