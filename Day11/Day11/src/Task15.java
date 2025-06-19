
import java.util.stream.IntStream;

public class Task15 {
    public static void main(String[] args) {
        IntStream nums = IntStream.iterate(1, n -> n + 1).limit(20);
        nums.skip(15).forEach(System.out::println);
    }
}
