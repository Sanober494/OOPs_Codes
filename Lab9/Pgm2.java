/*Write a program to read a line of text, tokenizes the line and only displays the tokens
which start with the letter “b”.*/

import java.util.*;

public class Pgm2 {

    public static void main(String args[]) {
        String c;
     

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String line = sc.nextLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        while (st.hasMoreTokens()) {
            c = st.nextToken();
          
            if (c.startsWith("b")) {
                System.out.println(c);
            }
        }

        sc.close();
    }

}
