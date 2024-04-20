package guru.springframeworkneeraj.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingsServiceImpl implements GreetingsService{
    @Override
    public String sayGreeting() {
        return "Hello Duniya - Property !!";
    }
}
