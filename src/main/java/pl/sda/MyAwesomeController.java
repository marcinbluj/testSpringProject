package pl.sda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class MyAwesomeController {

    @Autowired
    MyAwesomeService myAwesomeService;

    //    http://localhost:9000/?name=Marcin&surname=Bluj
    @RequestMapping
    public String helloDefault(@RequestParam("name") String name, @RequestParam("surname") String surname) { //nazwa zmiennej dowolna
        return "Hello world from Marcin to " + name + " " + surname;
    }

    //    http://localhost:9000/hello?name=Marcin
    //    http://localhost:9000/hello?name=Marcin&surname=Bluj
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return "Hello world from Marcin to " + name + " " + surname;
    }

    @RequestMapping("/hello3")
    public String hello3() {
        double result = myAwesomeService.add(2, 2);
        return "Hello world " + result;
    }

    @RequestMapping("/hello4/{name}")
    public String hello4(@PathVariable("name") String name) {
        double result = myAwesomeService.add(2, 2);
        return "Have a nice day  " + name + "!";
    }

    @RequestMapping("/hello5")
    public String hello5(@RequestParam("name") String name) {
        double result = myAwesomeService.add(2, 2);
        return "Have a nice day  " + name + "!";
    }

    @RequestMapping("/hello6")
    public String hello6(@RequestParam("name") String name,
                         @RequestParam(required = false, defaultValue = "Nazwisko") String surname) {
        double result = myAwesomeService.add(2, 2);
        return "Have a nice day  " + name + " " + surname + "!";
    }

    @RequestMapping("/customer2")
    public Customer customer2(){
        Customer customer = new Customer("Adam", "Kowalski");
        return customer;
    }

    //    http://localhost:9000/hello2/Marcin
    @RequestMapping("/hello2/{name}")
    public String hello2(@PathVariable("name") String name) {
        return "Hello world from Marcin to " + name;
    }

    @RequestMapping("/customer")
    public Customer customer() {
        Customer customer = new Customer("m", "b");
        return customer;
    }

    @RequestMapping("/message")
    public void message(@RequestBody String message) { //nazwa zmiennej dowolna
        System.out.println("podana wartosc to: " + message);
    }

}
