package guru.springframeworkneeraj.sfgdi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getString() {
        return "Hello World - in English !! ";
    }
}
