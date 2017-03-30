package twu.exercises;

/**
 * Created by smolina on 29/3/17.
 */
public class Triangle extends Shape {

    public void drawARightTriangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                printAsterisk();
            }
            System.out.println();
        }
    }

    public void isoscelesTriangle(int number, int initialSpaces) {
        int numberAsterisks = 1;
        for (int i = 0; i < number; i ++) {
            for (int j = initialSpaces ; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < numberAsterisks ; j++) {
                printAsterisk();
            }
            numberAsterisks += 2;
            initialSpaces--;
            System.out.println();
        }
    }
}
