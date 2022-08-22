package CarService;
import HomeWork.Car;

public class CarServicePrice {
    public void priceCarsShow (Car[] cars) {
        for (Car car: cars) {
            if (car.getPrice() >= 550) {
                System.out.println(car);
            }
        }
    }
}
