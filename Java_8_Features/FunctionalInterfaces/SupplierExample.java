package Java_8_Features.FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println(randomNumber.get());
    }
}
