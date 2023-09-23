/*3.	WAJP which displays the square and cube of all numbers from 0 to 10 e.g.
      Number	Square		Cube
      0		0		0
      1	    1		1
      2		4		8 
 */

import java.lang.Math;

public class Pgm3 {
    public static void main(String args[]) {
        System.out.println("Number" + "\t " + "Square" + "\t " + "Cube");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "\t" + Math.pow(i, 2) + "\t" + Math.pow(i, 3));
        }

    }
}
