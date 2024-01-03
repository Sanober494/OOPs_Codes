/*Consider an Animal abstract class which has an abstract method public void makeSound();
It has a concrete method public void eat() which indicates ‘’ I am eating”; 
Now I have a concrete Dog class which extends the Animal base class .Similarly we have a 
concrete cat class which extends the Animal base class .Further Dog class has accessor and mutator 
methods to have information about the breed of the Dog which is a string variable. Create a Test class
using which I can create an instance of Dog class and cat class and store them in a single ArrayList of Animal objects.
Further via a for loop I wish to retrieve the stored objects from the ArrayList and call the method that
will give the name of the breed of dog only.*/

import java.util.ArrayList;

abstract class Animal {
    public abstract void makeSound();
    
    public void eat() {
        System.out.println("I am eating");
    }
}

class Dog extends Animal {
    private String breed;
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Abs {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        
        Dog dog = new Dog();
        dog.setBreed("Labrador");
        animals.add(dog);
        
        Cat cat = new Cat();
        animals.add(cat);
        
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog dogObject = (Dog) animal;
                System.out.println("Breed of dog: " + dogObject.getBreed());
            }
        }
    }
}
