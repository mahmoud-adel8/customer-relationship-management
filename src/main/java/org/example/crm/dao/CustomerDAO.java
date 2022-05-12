package org.example.crm.dao;

import org.example.crm.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers();

    Customer getCustomer(int id);

    void saveOrUpdateCustomer(Customer customer);

    void deleteCustomer(int id);

}
