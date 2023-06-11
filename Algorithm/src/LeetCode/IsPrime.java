package Algorithm.src.LeetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPrime {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static class IsPrimeTest {
        @Test
        public void testIsPrime() {
            assertFalse(IsPrime.isPrime(-1));
            assertFalse(IsPrime.isPrime(0));
            assertFalse(IsPrime.isPrime(1));
            assertTrue(IsPrime.isPrime(2));
            assertTrue(IsPrime.isPrime(3));
            assertFalse(IsPrime.isPrime(4));
            assertTrue(IsPrime.isPrime(5));
            assertFalse(IsPrime.isPrime(6));
            assertTrue(IsPrime.isPrime(7));
            assertFalse(IsPrime.isPrime(8));
            assertFalse(IsPrime.isPrime(9));
            assertFalse(IsPrime.isPrime(10));
            assertTrue(IsPrime.isPrime(11));
            assertFalse(IsPrime.isPrime(12));
        }
    }


}
