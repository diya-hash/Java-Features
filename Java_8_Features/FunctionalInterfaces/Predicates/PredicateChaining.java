package Java_8_Features.FunctionalInterfaces.Predicates;

import java.util.function.Predicate;

public class PredicateChaining {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isLessThan10 = num -> num < 10;

        Predicate<Integer> isEvenAndLessThan = isEven.and(isLessThan10);
        System.out.println(isEvenAndLessThan.test(8));
        System.out.println(isEvenAndLessThan.test(12));

        Predicate<Integer> isEvenOrGreatterThan10 = isEven.or(isLessThan10);
        System.out.println(isEvenOrGreatterThan10.test(10));
        System.out.println(isEvenOrGreatterThan10.test(5));

        Predicate<Integer> isNotEven = isEven.negate();
        System.out.println(isNotEven.test(9));
    }
}
