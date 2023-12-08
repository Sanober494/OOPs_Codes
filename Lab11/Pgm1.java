/*Class Member is an abstract class. Class Society contains an array list which stores details of all members (both Standard
Member and Senior Member). Society also has a method which calculates the total fee of all members stored in the
array list.*/
package Lab11;

import java.util.*;

abstract class Member {
    private String name;
    private String address;

    public Member(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public abstract int getFee();

}

class StandardMember extends Member {
    StandardMember(String name, String address) {
        super(name, address);
    }

    public int getFee() {
        return 1000;
    }

}

class SeniorMember extends Member {
    SeniorMember(String name, String address, int fee) {
        super(name, address);
        this.fee = fee;
    }

    int fee;

    public int getFee() {
        return fee;
    }
}

class Society {
    public String name;
    ArrayList<Member> arr = new ArrayList<Member>();

    public void addMember(String name, String address) {
        StandardMember sm = new StandardMember(name, address);
        arr.add(sm);

    }

    public void addSeniorMember(String name, String address, int fee) {
        SeniorMember SM = new SeniorMember(name, address, fee);
        arr.add(SM);
    }

    public int getTotalFee() {
        int fees = 0;
        for (Member m : arr) {
            fees = fees + m.getFee();
        }
        return fees;
    }
}

public class Pgm1 {
    public static void main(String args[]) {
        Society s = new Society();
        s.addMember("Sanober", "Main Street 123");
        s.addSeniorMember("Ahmed", "Main Street 234", 2000);
        System.out.println("Total fee:" + s.getTotalFee());
    }
}
