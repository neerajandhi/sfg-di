package guru.springframeworkneeraj.sfgdi.controllers;

import guru.springframeworkneeraj.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    public GreetingsService greetingsService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingsServiceImpl") GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }
    public String getGreeting(){
        return greetingsService.sayGreeting();
    }
}
