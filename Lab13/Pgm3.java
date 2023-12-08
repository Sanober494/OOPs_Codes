/*Develop a JAVA program to compute the sum of 'num' numbers using 'n' threads. The main thread
reads the num and n from user and then creates n threads where each thread computes the sum of
num/n nos and thn displays the final sum.
eg, if num = 1000, and n = 4, the t1 computes sum of 1..250, t2 from 251 to 500, t3 from 501 to 750
and t4 from 751 to 1000. The main thread displays the final sum. (after ensuring that each thread has
finished its work).*/
class SumThread extends Thread {
    private int start;
    private int end;
    private int[] array;
    private long sum;

    public SumThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
    }

    public long getSum() {
        return sum;
    }
}

public class Pgm3 {
    public static void main(String[] args) {
      
        int num = 0;
        int n = 0;
        int[] array;

        try {
            System.out.print("Enter the value of num: ");
            num = Integer.parseInt(System.console().readLine());

            System.out.print("Enter the value of n: ");
            n = Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
            System.exit(1);
        }
   
        array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = i + 1;
        }

 
        SumThread[] threads = new SumThread[n];
        int chunkSize = num / n;

        for (int i = 0; i < n; i++) {
            int start = i * chunkSize;
            int end = (i == n - 1) ? num - 1 : start + chunkSize - 1;
            threads[i] = new SumThread(array, start, end);
            threads[i].start();
        }

        
        try {
            for (int i = 0; i < n; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long finalSum = 0;
        for (int i = 0; i < n; i++) {
            finalSum += threads[i].getSum();
        }

        System.out.println("The final sum is: " + finalSum);
    }
}
