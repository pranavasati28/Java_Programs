abstract class Vehicle{
    public void start(){
        System.out.println("Vehicle starts");
    }
    public void fuelType(){

    }
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car starts with key");
    }
    public void fuelType(){
        System.out.println("Petrol or diesel");
    }
    final void wheels(){
        System.out.println("4 wheels");
    }
}

class ElectricCar extends Car {
    public void start(){
        System.out.println("Electric car starts silently");
    }
    //public void wheels(){
    //    System.out.println("5 wheels "); // since wheels is final method it cannot be overried
    // }
}

class showroom {
    public static void welcome(){
        System.out.println("welcome to the showroom");
    } 
    
}
public class main {
    public static void main(String[] args) {
        
        showroom.welcome(); //static method

        ElectricCar elccar = new ElectricCar();
        elccar.start();
        // elccar.wheels();

        Car carobj = new Car();
        carobj.start();
        carobj.fuelType();
        carobj.wheels();

    }
    
}
