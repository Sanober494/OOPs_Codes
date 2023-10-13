package Lab7;
import java.util.ArrayList;
import java.util.Scanner;

public class Pgm2 {

    public static void checkDup(int Arr[]) {
        ArrayList<Integer> dupArr = new ArrayList<Integer>();
        ArrayList<Integer> numDup = new ArrayList<Integer>();

        for (int j = 0; j < Arr.length; j++) {
            int c = 0;
            int num = Arr[j];

            // Check if the element is already added to dupArr
            boolean alreadyAdded = false;
            for (int k = 0; k < dupArr.size(); k++) {
                if (num == dupArr.get(k)) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {
                for (int k = 0; k < Arr.length; k++) {
                    if (num == Arr[k]) {
                        c++;
                    }
                }

                if (c >= 2) {
                    dupArr.add(num);
                    numDup.add(c);
                }
            }
        }

        System.out.println("Duplicate element array:" + dupArr);
        int arraySize = dupArr.size();
        for (int l = 0; l < arraySize; l++) {
            System.out.println("The element " + dupArr.get(l) + " is repeated " + numDup.get(l) + " times");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            int n1 = sc.nextInt();
            array[i] = n1;
        }

        checkDup(array);
        sc.close();
    }
}
