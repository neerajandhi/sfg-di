package guru.springframeworkneeraj.sfgdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframeworkneeraj.sfgdi.SfgConstructorConfig;
import guru.springframeworkneeraj.sfgdi.datasource.FakeDataSource;
import guru.springframeworkneeraj.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframeworkneeraj.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframeworkneeraj.sfgdi.services.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

@EnableConfigurationProperties(SfgConstructorConfig.class)
@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingsServiceImpl constructorGreetingsServiceImpl(){
        return new ConstructorGreetingsServiceImpl();
    }

    @Bean
    PropertyGreetingsServiceImpl propertyGreetingsServiceImpl(){
        return new PropertyGreetingsServiceImpl();
    }

    @Bean
    SetterGreetingsServiceImpl setterGreetingsServiceImpl(){
        return new SetterGreetingsServiceImpl();
    }

    @Bean
    @Primary
    PrimaryGreetingsServiceImpl primaryGreetingsServiceImpl(){
        return new PrimaryGreetingsServiceImpl();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }
    @Bean
    @Profile("EN")
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Bean("i18nService")
    @Profile({"HI","default"})
    I18nHindiGreetingService i18nHindiGreetingService(){
        return new I18nHindiGreetingService();
    }

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Bean
    @Profile({"dog"})
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Bean
    @Profile({"cat","default"})
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    FakeDataSource fakeDataSource(SfgConstructorConfig sfgConstructorConfig){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConstructorConfig.getUsername());
        fakeDataSource.setPassword(sfgConstructorConfig.getPassword());
        fakeDataSource.setJdbcurl(sfgConstructorConfig.getJdbcurl());
        return fakeDataSource;
    }
}
