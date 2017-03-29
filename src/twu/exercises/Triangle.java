package twu.exercises;

/**
 * Created by smolina on 29/3/17.
 */
public class Triangle {

    public void printAsterik() {
        System.out.println("Easiest exercise ever:");
        System.out.println("*");
    }

    public void drawHorizontalLine(int number) {
        System.out.println("Draw a horizontal line");
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void drawVerticalLine(int number) {
        System.out.println("Draw a vertical line:");
        for (int i = 0; i < number; i++) {
            System.out.println("*");
        }
    }

    public void drawARightTriangle(int number) {
        System.out.println("Draw a right triangle:");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
