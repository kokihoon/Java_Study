import java.util.Arrays;
import java.util.List;

public class SteamPipelinesExample {
    public static void main(String[] args) {
        List<Member1> list = Arrays.asList(
                new Member1("홍길동", Member1.MALE, 30),
                new Member1("김나리", Member1.FEMALE, 20),
                new Member1("박수미", Member1.FEMALE, 45),
                new Member1("신용권", Member1.MALE, 27)

        );

        double ageAvg = list.stream()
                .filter(m -> m.getSex() == Member1.MALE)
                .mapToInt(Member1 :: getAge)
                .average()
                .getAsDouble();

        System.out.println("남자 평균 나이 : " + ageAvg);
    }
}
