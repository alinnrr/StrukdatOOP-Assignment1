public class Car {
    //atributes
    private String brand;
    private String type;
    private String color;
    private int speed;
    
    //constructor 
    public Car(){
    }
    public Car(String brand, String color, String type, int speed){
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.speed = speed;
    }

    //methods
    public void accelerate(int speedincrease){
    }
    public String getBrand(){
      return brand;
    }
    public String getType(){
    return type;
    }
    public String getColor(){
    return color;
    }
    public int getSpeed(){
    return speed;
    }
}
 //Abstract method (Abstraction)
    public abstract void engineType() ;
}

//Electric Car
class ElectricCar extends Car {

    public ElectricCar(String brand, String color, String type, int speed) {
         super(brand, color, type, speed);
    }

    @Override
    public void engineType() {
        System.out.println("Engine Type : Electric Motor");
    }
}


//Gas Car
class GasCar extends Car {

    public GasCar(String brand, String color, String type, int speed) {
        super(brand, color, type, speed);
    }

    @Override
    public void engineType() {
        System.out.println("Engine Type : Gasoline Engine");
    }
}

