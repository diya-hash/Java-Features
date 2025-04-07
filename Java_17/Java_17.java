import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Java_17 {
    public static void main(String[] args) {
        // Pattern Matching
        // Example: Before
        Object obj = "Hello, World!";

        switch (obj.getClass().getSimpleName()) {
            case "String":
                String str = (String) obj; // Manual casting
                System.out.println("String of length: " + str.length());
                break;
            case "Integer":
                Integer number = (Integer) obj; // Manual
                                                // //
                                                // casting
                System.out.println("Integer value: " + number);
                break;
            default:
                System.out.println("Unknown type");
                break;
        }

        // Example: After
        Object object = "Hello, World!";

        switch (object) {
            case String str -> System.out.println("String of length: " + str.length());
            case Integer number -> System.out.println("Integer value: " + number);
            default -> System.out.println("Unknown type");
        }
    }

}

// Example: Traditional Design Without Sealed Classes
// abstract class Shape { It used to be used this way, before 'sealed' came into
// the picture
// abstract double area();
// }

// Example: Using Sealed Classes (Introduced in JEP 409)
sealed class Shape permits Circle, Rectangle, Triangle {
    // Common properties or methods for shapes
}

final class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

final class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}

final class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

// Example: Generating Random Numbers with JEP 356 (BEFORE)

class OldRandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Random integer: " + random.nextInt());
        System.out.println("Random double: " + random.nextDouble());
    }
}

// With JEP 356 (New Way):
class NewRandomExample {
    public static void main(String[] args) {
        // Use the RandomGeneratorFactory to get different PRNG algorithms
        RandomGenerator random = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();

        // Generate different types of random numbers
        System.out.println("Random integer: " + random.nextInt());
        System.out.println("Random double: " + random.nextDouble());

        random.ints(5, 1, 10)
                .forEach(System.out::println);
    }
}

// Example: Deterministic Behavior with Seeded Random Generators
class DeterministicRandomExample {
    public static void main(String[] args) {
        // Create a RandomGenerator with a fixed seed
        long seed = 42L;
        RandomGenerator random1 = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(seed);
        RandomGenerator random2 = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(seed);

        // Generate and print a sequence of random numbers using both generators
        System.out.println("Sequence from random1:");
        for (int i = 0; i < 5; i++) {
            System.out.print(random1.nextInt(100) + " ");
        }

        System.out.println("\n\nSequence from random2:");
        for (int i = 0; i < 5; i++) {
            System.out.print(random2.nextInt(100) + " ");
        }
    }
}
