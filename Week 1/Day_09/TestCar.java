/**
 * TestCar
 */


public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020, "Black");
        Car car2 = new Car("Honda", "Accord", 2019, "White");

        car1.printDetails();
        car2.printDetails();
    }
}
