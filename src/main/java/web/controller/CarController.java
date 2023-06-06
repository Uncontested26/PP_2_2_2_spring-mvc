package web.controller;


import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import web.service.CarService;
import web.service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();
@Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count",defaultValue = "5",required = false) Integer count, ModelMap model) {
        List<Car> cars = carService.getCarsByCount(count);
        model.addAttribute("cars", cars);
        return "cars";


    }


            }
