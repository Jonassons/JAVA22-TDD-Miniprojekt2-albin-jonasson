package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import main.Prime;

public class PrimeTest {
	
	@Test
	@DisplayName("Testing prime number calculation from 1 to 1000")
	void calculateTest() {
		Prime prime = new Prime(1, 1000);
        assertNotNull(prime.getPrimes());
        assertFalse(prime.getPrimes().isEmpty());
        for (Integer primeNumber : prime.getPrimes()) {
            assertNotNull(primeNumber);
        }
        prime.printCount();
        prime.printSum();
	}
	
	@Test
	 @DisplayName("Testing prime number identification within the range of 2 to 10")
	void isPrimeTest() {
		Prime prime = new Prime(2, 10);
        assertTrue(prime.numIsPrime(2));
        assertTrue(prime.numIsPrime(3));
        assertTrue(prime.numIsPrime(5));
        assertTrue(prime.numIsPrime(7));
        assertFalse(prime.numIsPrime(4));
        assertFalse(prime.numIsPrime(6));
        assertFalse(prime.numIsPrime(8));
        assertFalse(prime.numIsPrime(9));
        assertFalse(prime.numIsPrime(10));
	}
}
