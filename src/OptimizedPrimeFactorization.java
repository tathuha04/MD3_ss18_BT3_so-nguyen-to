public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int number = 2; number < 100; number++) {
            if (isPrime(number)) {
                System.out.println("O " + number);
            }
        }

    }

    private boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
