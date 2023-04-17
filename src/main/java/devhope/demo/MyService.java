package devhope.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MyService {
    private final MyComponent myComponent;

    public String getName(){
        System.out.println("MyService.getName() has been called");

        return myComponent.getMyComponentName();
    }

}
