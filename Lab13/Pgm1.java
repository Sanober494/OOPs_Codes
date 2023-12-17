/*a.WAJP to generate prime numbers between a given range of numbers.
b.Modify the class Prime in Prime program to generate IllegalArgumentException if the argument
passed to the constructor of the class Prime is negative.
c.In the above define you own Exception class (Instead of IllegalArgumentException*/
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

// Method two:


class negPrime extends Exception {
    public negPrime() {
        System.out.println("Negative number encountered!");
    }
}

class Prime {

    public int n;
    public int m;

    public Prime(int n, int m) throws negPrime {
        this.n = n;
        this.m = m;
        if (n < 0 || m < 0)
            throw new negPrime();
    }

    public void genPrime() {
        for (int i = n; i < m + 1; i++) {
            int c = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    c = 1;
                }
            }
            if (c == 0) {
                System.out.println(i);
            }

        }
    }
}

class Pgm1 {
    public static void main(String args[]) {
        try {
            Prime p = new Prime(10, 20);
            p.genPrime();
        } catch (negPrime e) {
            System.out.println(e);
        }

    }
}
