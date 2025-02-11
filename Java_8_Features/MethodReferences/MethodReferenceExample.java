package Java_8_Features.MethodReferences;

import java.util.function.Consumer;

public class MethodReferenceExample {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Consumer<String> printer = MethodReferenceExample::printMessage;

        printer.accept("Hello world");
    }
}
