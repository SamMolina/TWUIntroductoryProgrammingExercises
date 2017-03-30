package twu.exercises;

/**
 * Created by smolina on 29/3/17.
 */
public class Diamond extends Triangle{

    public void diamond (int number) {
        int numberAsterisks = number, numberSpaces = 1;
        isoscelesTriangle(number, number - 1);

        for (int i = 0; i < number; i ++) {
            for (int j = 0 ; j < numberSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numberAsterisks ; j++) {
                printAsterisk();
            }
            numberAsterisks -= 2;
            numberSpaces++;
            System.out.println();
        }
    }

    public void diamondWithName (String name, int number) {
        int numberAsterisks = number, numberSpaces = 1;
        isoscelesTriangle(number - 1, number - 1);

        System.out.println(name);
        for (int i = 0; i < number; i ++) {
            for (int j = 0 ; j < numberSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numberAsterisks ; j++) {
                printAsterisk();
            }
            numberAsterisks -= 2;
            numberSpaces++;
            System.out.println();
        }
    }
}
