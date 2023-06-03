package Service;

import Cars.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    private Car ladaG = new Car("LADA", "Red", "Granta");
    private Car toyota = new Car("Toyota", "Green", "Camry");
    private Car nissan = new Car("Nissan", "Black", "Patrol");
    private Car suzuki = new Car("Suzuki", "Yellow", "Sport");
    private Car ladaV = new Car("LADA", "Black", "Vesta");

@Override
    public List<Car> saveCars() {

        cars.add(ladaG);
        cars.add(toyota);
        cars.add(nissan);
        cars.add(suzuki);
        cars.add(ladaV);
        return cars;
    }
@Override
    public List<Car> numberCar(List<Car> list, Integer number) {
        if (number == 0 || number > 5)
            return list;
        return list.stream().limit(number).toList();
    }
}
