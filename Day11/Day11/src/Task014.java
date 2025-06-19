import java.util.stream.IntStream;
public class Task014 {
    public static void main(String[] args) {
        System.out.println(" Numbers after skipping first 10: ");

        IntStream nums = IntStream.iterate(1, n -> n + 1).limit(20);
        nums.skip(10).forEach(System.out::println);
    }
}

