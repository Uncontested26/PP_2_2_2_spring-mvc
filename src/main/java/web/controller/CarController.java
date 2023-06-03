package web.controller;


import Cars.Car;
import Service.CarService;
import Service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarServiceImpl();


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carService.saveCars());

        model.addAttribute("cars", carService.numberCar(carService.saveCars(),count));
        return "cars";


    }


}

