public class BeepPrintExample2 {
    public static void main(String[] args) {
//        Runnable beepTask = new BeekTask();
        Thread thread = new Thread( () -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("타타타타");
                try {
                    Thread.sleep(500);
                }catch (Exception e) {

                }
            }
        });

        thread.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }catch (Exception e) {

            }
        }
    }
}
