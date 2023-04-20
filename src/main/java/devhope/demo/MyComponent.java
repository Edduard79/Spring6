package devhope.demo;

import org.springframework.stereotype.Component;

@Component
public class MyComponent{

    private String myComponentName;

    public  MyComponent(){
        this.myComponentName = "Paolino";

        System.out.println("MyComponent constructor has been called");
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName()");
        return myComponentName;
    }

}