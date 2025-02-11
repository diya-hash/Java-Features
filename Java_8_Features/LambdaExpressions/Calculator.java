package Java_8_Features.LambdaExpressions;

import Java_8_Features.LambdaExpressions.ICalculator.IAdd;
import Java_8_Features.LambdaExpressions.ICalculator.ICircleArea;
import Java_8_Features.LambdaExpressions.ICalculator.IDiameter;
import Java_8_Features.LambdaExpressions.ICalculator.IPrint;

public class Calculator {
    public static void main(String[] args) {
        IAdd sumCalculator = (num1, num2) -> {
            return (num1 + num2);
        };
        System.out.println(sumCalculator.add(10, 16));

        ICircleArea circleAreaCalculator = (radius) -> {
            return 2.0 * radius * Math.PI;
        };
        System.out.println(circleAreaCalculator.calculateCircleArea(3));

        IDiameter diameterCalculator = (radius) -> {
            return 2 * radius;
        };
        System.out.println(diameterCalculator.calculateDiameter(5));

        IPrint messagePrinter = () -> {
            System.out.println("Hello world");
        };
        messagePrinter.printMessage();
    }
}