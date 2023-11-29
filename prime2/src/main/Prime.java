package main;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    private List<Integer> primes;
    private int count = 0;
    private int sumOfPrimes = 0;
    private int lowerLimit;
    private int upperLimit;

    public Prime(int firstNumber, int lastNumber) {
        if (isValidRange(firstNumber, lastNumber)) {
            primes = new ArrayList<>();
            lowerLimit = firstNumber;
            upperLimit = lastNumber;
            calculatePrimes(firstNumber, lastNumber);
        } else {
            System.out.println("Hoppsan, fel intervall angivet!");
        }
    }

    private boolean isValidRange(int firstNumber, int lastNumber) {
        return firstNumber >= 0 && lastNumber <= 1000 && firstNumber <= lastNumber;
    }

    public boolean numIsPrime(int current) {
        if (current <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(current); i++) {
            if (current % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void calculatePrimes(int current, int stop) {
        while (current <= stop) {
            if (numIsPrime(current)) {
                primes.add(current);
                sumOfPrimes += current;
                count++;
            }
            current++;
        }
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    public void printCount() {
        System.out.println("Hej, det finns " + count + " primtal mellan " + lowerLimit + " och " + upperLimit + "!");
    }

    public void printSum() {
        System.out.println("Och den totala summan av dessa primtal är " + sumOfPrimes + ".");
    }
}

