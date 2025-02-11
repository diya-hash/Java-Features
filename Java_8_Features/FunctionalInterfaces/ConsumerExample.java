package Java_8_Features.FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printMessage = str -> System.out.println(str);

        printMessage.accept("Hello world");
    }
}
