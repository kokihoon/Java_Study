public class BeekTask implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("ㅊ탗차차차");
            try {
                Thread.sleep(500);
            }catch (Exception e) {

            }
        }
    }
}
