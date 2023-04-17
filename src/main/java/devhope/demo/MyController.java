package devhope.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
@Controller

public class MyController {
    private final MyService myService;



    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyController.getName() has been called");

        return myService.getName();
    }

    @GetMapping("/")
    public String hello(){
        System.out.println("MyController.hello has been called");

        return "Hello From Spring!! :D";
    }


}
