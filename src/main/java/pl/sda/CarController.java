package pl.sda;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @RequestMapping("/cars")
    public String test(){
        return "CAR";
    }
}
