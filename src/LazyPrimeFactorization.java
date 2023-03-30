import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable {

    @Override
    public void run() {
        for (int number = 2; number < 100; number++) {
            if (isPrime(number)) {
                System.out.println("L " + number);
            }
        }
    }
    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
