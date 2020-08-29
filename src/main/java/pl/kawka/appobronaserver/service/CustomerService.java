package pl.kawka.appobronaserver.service;

import pl.kawka.appobronaserver.model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomerList();

    String postCustomerCreate(Customer customerCreate);

    List<Customer> postCustomerRead(Customer customerRead);

    List<Customer> postCustomerDelete(Customer customerDelete);
}
