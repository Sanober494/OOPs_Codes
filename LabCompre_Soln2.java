// Solution of question 2 from OOPs Lab Compre held on 12th Dec 2023.

import java.util.*;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;

    }

    public abstract void greets();
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog Dog) {
        System.out.println("Wooooof");
    }
}

class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woow");
    }

    public void greets(Dog Dog) {
        System.out.println("Wooooow");
    }

    public void greets(BigDog BigDog) {
        System.out.println("Wooooooooow");
    }
}

class pgm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Cat c = new Cat("Cattie");
        Dog d = new Dog("Doggie");
        BigDog d1 = new BigDog("Big Doggie");
        c.greets();
        d.greets();
        d.greets(d);
        d1.greets();
        d1.greets(d);
        d1.greets(d1);
        sc.close();
    }
}
