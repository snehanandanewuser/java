public class primenumbers {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Prime numbers between 0 and 1000:");

        for (int num = 2; num <= 1000; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println("\nTotal number of prime numbers between 0 and 1000: " + count);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
