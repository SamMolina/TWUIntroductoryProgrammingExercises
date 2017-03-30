package twu.exercises;

/**
 * Created by smolina on 29/3/17.
 */
public class Main {

    public static void main (String[] args) {
        Shape shape = new Shape();
        Triangle triangle = new Triangle();
        Diamond diamond = new Diamond();
        NumberExercises numbers = new NumberExercises();

        System.out.println("== Triangle Exercises ==");
        System.out.println("Easiest exercise ever:");
        shape.printAsterisk();
        System.out.println("\nDraw a horizontal line");
        shape.drawHorizontalLine(8);
        System.out.println("Draw a vertical line:");
        shape.drawVerticalLine(3);
        System.out.println("Draw a right triangle:");
        triangle.drawARightTriangle(6);

        System.out.println("== Diamond Exercises ==");
        System.out.println("Isosceles Triangle:");
        triangle.isoscelesTriangle(3, 2);
        System.out.println("Diamond:");
        diamond.diamond(3);
        System.out.println("Diamond with Name:");
        diamond.diamondWithName("Sam ♥",3);

        System.out.println("== FizzBuzz Exercise ==");
        numbers.FizzBuzz();

        System.out.println("== Prime Factors Exercise ==");
        numbers.generate(30);
    }
}
