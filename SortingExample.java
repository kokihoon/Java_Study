import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});
        intStream
         .sorted()
         .forEach(n -> System.out.print(n +","));
        System.out.println();


        List<Student1> student1List = Arrays.asList(
                new Student1("홍길동", 30),
                new Student1("신용권", 10),
                new Student1("유미선", 20)
        );

        student1List.stream()
                .sorted()
                .forEach(s -> System.out.print(s.getScore() +", "));

        System.out.println();

        student1List.stream()
                .sorted(Comparator.reverseOrder() )
                .forEach(s -> System.out.print(s.getScore() + ","));
    }
}
