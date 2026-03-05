public class Main {
    public static void main (String[]args) throws Exception {

        Car myCar = new Car();
        Car mySuzuki = new Car("Suzuki", "Red", "Brio", 200);

    System.out.println(mySuzuki.getBrand());
    System.out.println(mySuzuki.getType());
    System.out.println(mySuzuki.getColor());
    System.out.println(mySuzuki.getSpeed());
    }
}