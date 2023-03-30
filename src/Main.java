public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        Thread thread = new Thread(lazyPrimeFactorization);
        Thread thread1 = new Thread(optimizedPrimeFactorization);

        thread.start();
        thread1.start();
    }
}