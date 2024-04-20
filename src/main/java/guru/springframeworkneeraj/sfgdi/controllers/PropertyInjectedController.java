package guru.springframeworkneeraj.sfgdi.controllers;

import guru.springframeworkneeraj.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingsServiceImpl")
    @Autowired
    public GreetingsService greetingsService;

    public String getGreeting(){
        return greetingsService.sayGreeting();
    }
}
