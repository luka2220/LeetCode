import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        fizzBuzz(3).forEach(System.out::println);
        fizzBuzz(5).forEach(System.out::println);
        fizzBuzz(15).forEach(System.out::println);
    }

    static public List<String> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> i % 3 == 0 && i % 5 == 0 ? "FizzBuzz"
                        : i % 3 == 0 ? "Fizz"
                        : i % 5 == 0 ? "Buzz"
                        : Integer.toString(i))
                .collect(Collectors.toList());
    }
}