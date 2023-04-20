package devhope.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
        System.out.println("MyController constructor has benn called");
    }


    @GetMapping("/getName")
    public String getName(){

        return myService.getName();
    }

    @GetMapping("/")
    public String welcome(){

        return "Hello From Spring!! :D";
    }


}
