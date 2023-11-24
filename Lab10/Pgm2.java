package Lab10;

class Car{

    public double price;
    public int year;
      public Car(double price, int year) {
        this.price = price;
        this.year = year;
    }
    public String toString(){
        return "Price: "+ price+ "Year: "+year;
    } 
    public double calculateSalePrice(){
     return price;
    
    }
}

class SportsCar extends Car{
    public SportsCar(double price, int year) {
        super(price, year);
    }
    public double calculateSalePrice(){
        if (year>2000){
        return 0.75*price;
     }   
     else if (year>1995){
        return 0.5*price;
     }
     else{
        return 0.25*price;
     }
    }
}

class ClassicCar extends Car {
    public ClassicCar(double price, int year) {
        super(price, year);
    }

    @Override
    public double calculateSalePrice() {
       
        return 10000.0;
    }
}



public class Pgm2 {
    public static void main(String args[]){
    ClassicCar clCar=new ClassicCar(300000,2000);
    SportsCar spCar=new SportsCar(50000, 1999);
    System.out.println( clCar.calculateSalePrice());
    System.out.println(spCar.calculateSalePrice());
}
}