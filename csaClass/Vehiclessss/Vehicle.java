package Vehiclessss;

public class Vehicle {
    int year;
    String brand;
    String color;
    public Vehicle(int year, String brand, String color){
        this.year = year;
        this.brand = brand;
        this.color = color;

    }
    public int getYear(){
        return year;
    }
    public String getBrand(){
      return brand;
    }
    public String getColor(){
        return color;
    }
}

class Car extends Vehicle{
    int seats;
    Car(int year, String brands, String color, int seat){
        super(year, brands, color);
        seats = seat;

    }
    public int getSeats(){
        return seats;
    }
}

class MotorBike extends Vehicle{
    int seats;

    MotorBike(int year, String brandy, String colour, int seat){
        super(year, brandy, colour);
        seats = seat;


    }
    public int getSeats(){
        return seats;
    }
}

class Volvo extends Car{
    String name;
     Volvo(int year, String color, int seats, String names){
        super(year, "Volvo", color, seats);
        name = names;
    }
    public String getName(){
         return name;
    }
}

class Tester{
    public static void main(String[] args) {
        Volvo v = new Volvo(2017, "Orange", 4, "Mazarato")
        System.out.println(v.getName());
        System.out.println(v.getSeats());
    }
}
