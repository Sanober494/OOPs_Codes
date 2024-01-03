/*Write a Java program to create two threads where one thread will print numbers in ascending order 
whereas second thread will print numbers in descending order between 1 to 10.*/

class AscendingThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ascending: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DescendingThread extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Descending: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        AscendingThread ascendingThread = new AscendingThread();
        DescendingThread descendingThread = new DescendingThread();

        ascendingThread.start();
        descendingThread.start();
    }
}
