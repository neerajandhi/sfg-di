package guru.springframeworkneeraj.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class PrimaryGreetingsServiceImpl implements GreetingsService{
    @Override
    public String sayGreeting() {
        return "Hello Duniya - From the Primary Bean !!";
    }
}
