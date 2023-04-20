package devhope.demo;


import org.springframework.stereotype.Service;


@Service
public class MyService {
    private MyComponent myComponent;


    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
        System.out.println("MyService constructor has been called");
    }


    public String getName(){
        System.out.println("MyService.getName() has been called");

        return myComponent.getMyComponentName();
    }
}
