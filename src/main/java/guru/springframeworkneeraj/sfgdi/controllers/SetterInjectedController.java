package guru.springframeworkneeraj.sfgdi.controllers;

import guru.springframeworkneeraj.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    public GreetingsService greetingsService;

    @Qualifier("setterGreetingsServiceImpl")
    @Autowired
    public void setGreetingsService(GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }

    public String getGreeting(){
        return greetingsService.sayGreeting();
    }
}
