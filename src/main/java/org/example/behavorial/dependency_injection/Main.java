package org.example.behavorial.dependency_injection;

public class Main {
    public static void main(String [] args){

        CustomerService customerService = new CustomerManager(new FileLogger());
        customerService.save();
    }
}
