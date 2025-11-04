import model.constructor.Car;

public class Main {
    public static void main(String[] args) {
        String city1;
        city1 = "serap";
        System.out.println(city1);
        city1 = "San Francisco";
        System.out.println(city1);
        Car car = new Car();
        Car car2 = new Car(1, "bmw", "red", 2024);
        Car car3 = new Car(1, "bmw", "red");
        Car car4 = new Car();
        car2.setModel("mercedes");
    }
}