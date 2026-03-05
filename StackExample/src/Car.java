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



