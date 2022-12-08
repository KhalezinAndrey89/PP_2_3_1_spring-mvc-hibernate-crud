package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarsController {

    @GetMapping("/{count}")
    public String showCars(@RequestParam(defaultValue = "5", value = "count") int count, Model model) {
        model.addAttribute("count", new CarServiceImp().getCar(count));
        return "cars_show";
    }
}