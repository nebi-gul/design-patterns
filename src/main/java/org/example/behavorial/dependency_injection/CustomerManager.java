package org.example.behavorial.dependency_injection;

public class CustomerManager implements CustomerService {
    private Logger logger ;

    public CustomerManager(Logger logger){
        this.logger = logger;
    }


    @Override
    public void save() {
        logger.log();

    }
}
