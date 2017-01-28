package pl.sda;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    List<Car> cars = new ArrayList<>();

    public CarService(){
        cars.add(new Car("Opel", "Vectra", 2001, "Silver", 5, 12314));
        cars.add(new Car("Mazda", "6", 2005, "Black", 5, 14211));
        cars.add(new Car("Ford", "Mondeo", 2010, "Red", 5, 51251));
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car getById(int id) throws CarNotFoundException {
        return cars.stream()
                .filter(x-> x.getId()==id)
                .findFirst()
                .orElseThrow(() -> new CarNotFoundException());
    }

    public List<Car> getByBrand(String brand) {
        return cars.stream()
                .filter(x-> x.getBrand().equals(brand))
                .collect(Collectors.toList());
    }
}
