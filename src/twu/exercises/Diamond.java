package twu.exercises;

/**
 * Created by smolina on 29/3/17.
 */
public class Diamond {

    public void isoscelesTriangle(int number, int initialSpaces) {
        int numberAsterisks = 1;
        for (int i = 0; i < number; i ++) {
            for (int j = initialSpaces ; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < numberAsterisks ; j++) {
                System.out.print("*");
            }
            numberAsterisks += 2;
            initialSpaces--;
            System.out.println();
        }
    }

    public void diamond (int number) {
        System.out.println("Diamond:");
        isoscelesTriangle(number, number - 1);
        int numberAsterisks = number, numberSpaces = 1;
        for (int i = 0; i < number; i ++) {
            for (int j = 0 ; j < numberSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numberAsterisks ; j++) {
                System.out.print("*");
            }
            numberAsterisks -= 2;
            numberSpaces++;
            System.out.println();
        }
    }

    public void diamondWithName (String name, int number) {
        System.out.println("Diamond with Name:");
        isoscelesTriangle(number - 1, number - 1);
        int numberAsterisks = number, numberSpaces = 1;
        System.out.println(name);
        for (int i = 0; i < number; i ++) {
            for (int j = 0 ; j < numberSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numberAsterisks ; j++) {
                System.out.print("*");
            }
            numberAsterisks -= 2;
            numberSpaces++;
            System.out.println();
        }
    }
}
