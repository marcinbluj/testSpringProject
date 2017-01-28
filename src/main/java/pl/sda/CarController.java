package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarService carService;

    @RequestMapping
    public List<Car> getAllCars() {
        return carService.getCars();
    }

    @RequestMapping("/{id}")
    public Car getById(@PathVariable("id") int id) throws CarNotFoundException {
        return carService.getById(id);
    }

    @RequestMapping("/car")
    public List<Car> getByBrand(@RequestParam("brand") String brand) {
        return carService.getByBrand(brand);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCar(@RequestBody Car car) {
        carService.add(car);
    }
}
