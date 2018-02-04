import java.util.Arrays;
import java.util.List;

public class SequencialVsParallelExample {
    public static void work(int value) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
    }
    public static long testSequencial(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().forEach((a) -> work(a));
        long end = System.nanoTime();
        long runTime = end - start;
        return runTime;
    }

    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().parallel().forEach((a) -> work(a));
        long end = System.nanoTime();
        long runTime = end - start;
        return runTime;
    }
    public static void main(String... args) {
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        long timeSequencial = testSequencial(list);

        long timeParallel = testParallel(list);

        if(timeSequencial < timeParallel) {
            System.out.println("성능 테스트 결과: 순차 처리가 더 빠름");
        }else {
            System.out.println("성능 테스트 결과: 병렬 처리가 더 빠름");
        }

    }
}
