import java.awt.*;

public class BeepPrintExample1 {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 5; i++) {
            toolkit.beep();
            System.out.println("타타");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
        for(int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }catch (Exception e) {
            }
        }
    }
}
