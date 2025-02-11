package Java_8_Features.Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateWithStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(32, 54, 87, 17, 1);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

    }
}