package twu.exercises;

/**
 * Created by smolina on 29/3/17.
 */
public class Exercises {

    public static void main (String[] args) {
        Triangle triangle = new Triangle();
        Diamond diamond = new Diamond();
        Numbers numbers = new Numbers();

        System.out.println("== Triangle Exercises ==");
        triangle.printAsterik();
        triangle.drawHorizontalLine(8);
        triangle.drawVerticalLine(3);
        triangle.drawARightTriangle(6);

        System.out.println("== Diamond Exercises ==");
        System.out.println("Isosceles Triangle:");
        diamond.isoscelesTriangle(3, 2);
        diamond.diamond(3);
        diamond.diamondWithName("Sam ♥",3);

        System.out.println("== FizzBuzz Exercise ==");
        numbers.FizzBuzz();

        System.out.println("== Prime Factors Exercise ==");
        numbers.generate(30);
    }

}
