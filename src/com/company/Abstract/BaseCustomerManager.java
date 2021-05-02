package com.company.Abstract;

import com.company.Entities.Customer;

public abstract class BaseCustomerManager implements customerService {
    @Override
    public void Save(Customer customer) {
        System.out.println("Saved tp DB : " + customer.getFirstName());
    }
}
