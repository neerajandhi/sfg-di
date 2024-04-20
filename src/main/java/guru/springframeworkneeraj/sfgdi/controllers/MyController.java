package guru.springframeworkneeraj.sfgdi.controllers;

import guru.springframeworkneeraj.sfgdi.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }

    public String getGreeting(){
        return greetingsService.sayGreeting();
    }
}
