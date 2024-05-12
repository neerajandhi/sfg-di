package guru.springframeworkneeraj.sfgdi.services;

import org.springframework.stereotype.Service;


public class SetterGreetingsServiceImpl implements GreetingsService{
    @Override
    public String sayGreeting() {
        return "Hello Duniya - Setter !!";
    }
}
