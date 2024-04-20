package guru.springframeworkneeraj.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("EN")
public class I18nEnglishGreetingService implements GreetingsService{
    @Override
    public String sayGreeting() {
        return "Hello World - in English !! ";
    }
}
