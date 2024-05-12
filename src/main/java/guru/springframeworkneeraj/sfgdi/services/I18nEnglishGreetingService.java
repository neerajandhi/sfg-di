package guru.springframeworkneeraj.sfgdi.services;

import guru.springframeworkneeraj.sfgdi.repositories.EnglishGreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service("i18nService")
//@Profile("EN")
public class I18nEnglishGreetingService implements GreetingsService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - in English !! ";
    }
}
