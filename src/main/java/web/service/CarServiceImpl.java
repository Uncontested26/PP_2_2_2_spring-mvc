package web.service;


import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("LADA", "Red", "Granta"));
        cars.add(new Car("Toyota", "Green", "Camry"));
        cars.add(new Car("Nissan", "Black", "Patrol"));
        cars.add(new Car("Suzuki", "Yellow", "Sport"));
        cars.add(new Car("LADA", "Black", "Vesta"));
    }


    @Override
    public List<Car> getCarsByCount(Integer count) {
        if (count == 0 || count > 5) {
            return cars;
        }
        return cars.stream().limit(count).toList();


    }
}
