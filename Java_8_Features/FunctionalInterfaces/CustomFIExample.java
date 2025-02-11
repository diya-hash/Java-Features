package Java_8_Features.FunctionalInterfaces;

@FunctionalInterface
interface StringFormatter {
    String format(String input);
}

public class CustomFIExample {
    public static void main(String[] args) {
        StringFormatter stringUpperCaseFormatterc = str -> str.toUpperCase();
        System.out.println(stringUpperCaseFormatterc.format("hello"));
    }

}
