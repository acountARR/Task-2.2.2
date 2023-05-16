package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.CarServiceImp;

import java.util.Optional;

@Controller
public class CarsController {
    @Autowired
    private CarServiceImp carServiceImp;

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count") Optional<Integer> count, ModelMap model) {
        System.out.println(count);
        model.addAttribute("listCar", carServiceImp.getListCar(count.orElse(0)));
        return "cars";
    }

}
