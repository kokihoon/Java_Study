public class User1 extends Thread{
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User1");
        this.calculator = calculator;
    }

    // run1으로 실행
    public void run() {
        calculator.setMemory(100);
    }
}
