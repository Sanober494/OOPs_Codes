class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        System.out.println("Start and end must be non-negative.");
    }
}

class Prime {
    public int start;
    public int end;

    public Prime(int start, int end) throws NegativeNumberException {
        if (start < 0 || end < 0) {
            throw new NegativeNumberException();
        }

        this.start = start;
        this.end = end;
    }

    public void Primes() {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private boolean isPrime(int num) {
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

public class Pgm1 {
    public static void main(String[] args) {
        try {
            Prime prime = new Prime(10, 50);
            prime.Primes();
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
