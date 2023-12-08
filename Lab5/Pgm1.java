/*An election is contested by 5 candidates. The candidates are numbered 1 to 5 and the
voting is done by marking the candidate number on the ballot paper. Write a program
to read the ballots and count the votes cast for each candidate using an array variable
count. In case a number read is outside the range of 1-5, the ballot should be considered
as a spoilt ballot. The program should finally count the number of votes for each
candidate along with a count of spoilt votes.*/

import java.util.*;
public class Pgm1{
    int votes[];
    public static void main(String args[]) {
        int v1=0;
        int v2=0;
        int v3=0;
        int v4=0;
        int v5=0;
     
          Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of ballots: ");
      int n1=sc.nextInt();
         int[] votes=new int[n1]; 
         int spoiltBallot=0;
      for (int i=0; i<n1;i++){
        System.out.println("Enter your choice[1-5]:");
        int newVote=sc.nextInt();
        if (newVote>5){spoiltBallot++;}
        else{votes[i]=newVote;}}
for (int j=0;j<votes.length;j++){
if (votes[j]==1){
v1++;
}
else if (votes[j]==2){
v2++;
}
else if (votes[j]==3){
v3++;
}
else if (votes[j]==4){
v4++;
}
else {
v5++;
}

}
System.out.println("Number of votes for candidate 1:"+v1);
System.out.println("Number of votes for candidate 2:"+v2);
System.out.println("Number of votes for candidate 3:"+v3);
System.out.println("Number of votes for candidate 4:"+v4);
System.out.println("Number of votes for candidate 5:"+v5);
System.out.println("Number of spoitBallot:"+spoiltBallot);
sc.close();
      }
 
    }

