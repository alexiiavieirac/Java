package projects.java.objectorientation.test;
import projects.java.objectorientation.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        car2.newCar2 = "McLaren";
        car2.modelCar2 = "Sportive";
        car2.yearCar2 = 2025;

        System.out.println("Car 1");

        System.out.println("Car Name: " + car.newCar);
        System.out.println("Car Model: " + car.modelCar);
        System.out.println("Car Year: " + car.yearCar);

        System.out.println("\nCar 2 ");

        System.out.println("Car Name: " + car2.newCar2);
        System.out.println("Car Model: " + car2.modelCar2);
        System.out.println("Car Year: " + car2.yearCar2);
    }
}
