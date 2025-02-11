package Java_8_Features.LambdaExpressions;

public class ICalculator {
    @FunctionalInterface
    public interface IAdd {
        public int add(int a, int b);
    }

    @FunctionalInterface
    interface ICircleArea {
        public double calculateCircleArea(double radius);
    }

    @FunctionalInterface
    interface IDiameter {
        public int calculateDiameter(int radius);
    }

    @FunctionalInterface
    interface IPrint {
        public void printMessage();
    }
}
