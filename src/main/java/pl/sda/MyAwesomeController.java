package pl.sda;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyAwesomeController {


//    http://localhost:9000/hello?name=Marcin
//    http://localhost:9000/hello?name=Marcin&surname=Bluj
    @RequestMapping("/hello")
    public String hello( @RequestParam("name") String name, @RequestParam("surname")String surname) { //nazwa zmiennej dowolna
        return "Hello world from Marcin to " + name +" "+surname;
    }

//    http://localhost:9000/hello2/Marcin
    @RequestMapping("/hello2/{name}")
    public String hello2( @PathVariable("name") String name) { //nazwa zmiennej dowolna
        return "Hello world from Marcin to " + name;
    }

    @RequestMapping("/customer")
    public Customer customer() { //nazwa zmiennej dowolna
        Customer customer = new Customer("m", "b");
        return customer;
    }

    @RequestMapping("/message")
    public void message(@RequestBody String message) { //nazwa zmiennej dowolna
        System.out.println("podana wartosc to: "+ message);
    }


}
