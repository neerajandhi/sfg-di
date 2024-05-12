package guru.springframeworkneeraj.sfgdi.services;

import org.springframework.stereotype.Service;


public class ConstructorGreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello Duniya - constructor !!";
    }
}
