package org.example.behavorial.iterator;

public class ConcreteCustomerRepository implements CustomerRepository{
    private String customers[] ={"Nebi", "Ali" , "Veli", "Ayşe"};

    @Override
    public Iterator getIterator(){
        return new CustomerIterator(customers);
    }
}
