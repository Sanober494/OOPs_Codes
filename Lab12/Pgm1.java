/*Develop a JAVA program to simulate the movement of chess pieces on a chess board, using interfaces. Define an interface
movable with a method move(String newPos). Further define an abstract class Piece, and classes for each
type of chess piece (eg King, Queen etc) and override the method move(String newPos). (Pl refer to the sample
implementation shown below)
interface Movable() { void move(String newPos); }
abstract class ChessPiece implements movable {
String name; // eg “King”, “Queen” etc.
String color; // “White”, “Black”
String curPos; // “a1”,“c5” std chess board naming convention
public ChessPiece (/*appropriate parameters */ ) { }
}
class King extends ChessPiece {
/* appropriate implementation details */
}
In the main program create an ArrayList of Pieces, (any 3 of your choice) and simulate the movement on these pieces
on the chess board. You need not check if the move is a legal move, just print the message <Color> <PieceName> moving
from <curPos> to <newPos> as shown below.
Eg: (Comp) : Created 3 chess Pieces (eg. King(White):1, Queen(Black):2 , Pawn(White):3).
(Comp) : Enter which piece to be moved (0 to Quit) & new Position
(User) : 1 a6
(Comp) : White King moving from a7 to a6
(Comp) : Enter which piece to be moved (0 to Quit) & new Position
(User): 2 c5
(Comp) : Black Queen moving from c2 to c5
(Comp) : Enter which piece to be moved (0 to Quit) & new Position
(User) : 0 0
(Comp) : Bye, Thank you !!*/
import java.util.*;

interface movable
{
void move (String newPos);

}

abstract class ChessPiece implements movable{
    String name;
    String color;
    String curPos;
    public ChessPiece(String name, String color, String curPos){
    
        this.name=name;
        this.color=color;
        this.curPos=curPos;
    }
    public void move(String newPos){
        System.out.println(color+ " "+ name+" moving from "+ curPos+" to "+ newPos);
        curPos=newPos;
    }
}

class King extends ChessPiece{
    public King (String name, String color, String curPos){
        super(name, color, curPos);
    }


}

class Queen extends ChessPiece{
    public Queen (String name, String color, String curPos){
        super(name, color, curPos);
    }


}

class Pawn extends ChessPiece{
    public Pawn (String name, String color, String curPos){
        super(name, color, curPos);
    }


}




class Pgm1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<ChessPiece> p =new ArrayList<>();
p.add(new King ("King","White","a7"));
p.add(new Queen("Queen","Black","a6"));
p.add(new Pawn("Pawn","White","a5"));

System.out.println("(Comp) : Created 3 chess Pieces (King(White):1, Queen(Black):2, Pawn(White):3)");

while (true){
    System.out.print("(Comp) : Enter which piece to be moved (0 to Quit): ");
    int Index = sc.nextInt();
            if (Index == 0) {
                System.out.println("(Comp) : Bye, Thank you !!");
                break;
            }
    if (Index==1){
System.out.println("Enter position:");
sc.nextLine();
String pos=sc.nextLine();
King k= new King("King", "White", "a7");
k.move(pos);

    }

        if (Index==2){
System.out.println("Enter position:");
sc.nextLine();
String pos=sc.nextLine();
Queen q= new Queen("Queen", "Black", "a6");
q.move(pos);

    }

        if (Index==3){
System.out.println("Enter position:");
sc.nextLine();
String pos=sc.nextLine();
Pawn pawn= new Pawn("Pawn", "White", "a5");
pawn.move(pos);

    }
       
    }
     sc.close();
}

}
