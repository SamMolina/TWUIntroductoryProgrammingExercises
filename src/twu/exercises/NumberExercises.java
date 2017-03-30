package twu.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smolina on 29/3/17.
 */
public class NumberExercises {

    public void FizzBuzz() {
        int numbers = 100;
        for (int i = 1; i <= numbers; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        List<Integer> primesNumbers = generatePrimesNumbers(number);

        for (int i = 0; i < primesNumbers.size(); i++) {
            while ((number % primesNumbers.get(i) == 0) && (number != 1)) {
                number /= primesNumbers.get(i);
                primeFactors.add(primesNumbers.get(i));
                System.out.println(primesNumbers.get(i));
            }
        }
        return primeFactors;
    }

    public List<Integer> generatePrimesNumbers(int number) {
        List<Integer> primesNumbers = new ArrayList<Integer>();
        int sizePrimeNumbers;
        boolean isModNumber;
        primesNumbers.add(2);

        for (int i = 2; i <= number; i ++) {
            isModNumber = false;
            sizePrimeNumbers = primesNumbers.size();
            for (int j = 0; j < sizePrimeNumbers; j++) {
                if (i % primesNumbers.get(j) == 0) {
                    isModNumber = true;
                }
            }
            if ((!primesNumbers.contains(i)) && (isModNumber == false)) {
                primesNumbers.add(i);
            }
        }
        return primesNumbers;
    }
}
