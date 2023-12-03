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
