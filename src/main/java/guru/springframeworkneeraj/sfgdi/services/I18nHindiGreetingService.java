package guru.springframeworkneeraj.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service("i18nService")
//@Profile({"HI","default"})
public class I18nHindiGreetingService implements GreetingsService{
    @Override
    public String sayGreeting() {
        return "Hindi me Sabko Parnaam Duniya !!";
    }
}
