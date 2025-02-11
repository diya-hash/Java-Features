package Java_8_Features.Predicates;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (num1) -> num1 % 2 == 0;
        Predicate<Integer> isOdd = num1 -> num1 % 2 != 0;
        Predicate<String> isLongString = str -> str.length() > 5;

        System.out.println(isEven.test(4));
        System.out.println(isOdd.test(75));
        System.out.println(isLongString.test("mary"));
    }
}
