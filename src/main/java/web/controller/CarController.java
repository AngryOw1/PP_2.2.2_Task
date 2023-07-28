package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    CarService carService = new CarServiceImp();
    @GetMapping(value = "")
    public String printCars(ModelMap model) {
        List<Car> carList = carService.getAllCars();
        System.out.println(carList);
        model.addAttribute("cars4display", carList);
        return "cars";
    }
    @GetMapping(value = "", params = "count")
    public String printCountCars(@RequestParam int count, ModelMap model){
        List<Car> carList = carService.getSomeCars(count);
        model.addAttribute("cars4display", carList);
        return "cars";
    }
}
