package Java_8_Features.FunctionalInterfaces.Predicates;

import java.util.function.Predicate;

public class PredicateWithMethod {
    public static boolean checkNumber(int num, Predicate<Integer> predicate) {
        return predicate.test(num);
    }

    public static void main(String[] args) {
        Predicate<Integer> isPositive = num -> num > 0;

        System.out.println(checkNumber(5, isPositive));
        System.out.println(checkNumber(-10, isPositive));
    }
}
