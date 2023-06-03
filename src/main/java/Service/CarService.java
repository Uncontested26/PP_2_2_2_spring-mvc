package Service;

import Cars.Car;

import java.util.List;

public interface CarService {

    public List <Car> saveCars();


    public List<Car> numberCar(List<Car> list, Integer number);
}
