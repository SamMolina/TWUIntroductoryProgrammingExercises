package twu.exercises;

/**
 * Created by smolina on 30/3/17.
 */
public class Shape {

    public void printAsterisk() {
        System.out.print("*");
    }

    public void printAsteriskWithLine() {
        System.out.println("*");
    }

    public void drawHorizontalLine(int number) {
        for (int i = 0; i < number; i++) {
            printAsterisk();
        }
        System.out.println();
    }

    public void drawVerticalLine(int number) {
        for (int i = 0; i < number; i++) {
            printAsteriskWithLine();
        }
    }
}
