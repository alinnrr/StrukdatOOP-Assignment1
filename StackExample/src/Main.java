public class Main {

    public static void main(String[] args) throws Exception {

        Car myTesla = new ElectricCar("Tesla", "White", "Model 3", 250);
        Car myToyota = new GasCar("Toyota", "Black", "Supra", 220);

        System.out.println("=== Car Information ===");

        System.out.println(myTesla.getBrand());
        System.out.println(myTesla.getType());
        System.out.println(myTesla.getColor());
        System.out.println(myTesla.getSpeed());
        myTesla.engineType();

        System.out.println("---------------------");

        System.out.println(myToyota.getBrand());
        System.out.println(myToyota.getType());
        System.out.println(myToyota.getColor());
        System.out.println(myToyota.getSpeed());
        myToyota.engineType();

    }
}
