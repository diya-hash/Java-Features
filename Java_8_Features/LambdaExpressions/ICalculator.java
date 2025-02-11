package Java_8_Features.LambdaExpressions;

public class ICalculator {
    public interface IAdd {
        public int add(int a, int b);
    }

    interface ICircleArea {
        public double calculateCircleArea(double radius);
    }

    interface IDiameter {
        public int calculateDiameter(int radius);
    }

    interface IPrint {
        public void printMessage();
    }
}
