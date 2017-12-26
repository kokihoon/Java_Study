import java.lang.Math;

public class Exercise04 {
    public static void main(String[] args) {
        int sum = 0;
        while(true) {
            if(sum == 5) {
                break;
            }

            int x = (int)(Math.random()*6) + 1;
            int y = (int)(Math.random()*6) + 1;
            sum = x+y;
            System.out.println("("+x+", "+y+")");
        }
    }
}
