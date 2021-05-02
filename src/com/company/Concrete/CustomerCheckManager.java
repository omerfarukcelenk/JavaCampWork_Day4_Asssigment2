package com.company.Concrete;

import com.company.Abstract.CustomerCheackService;
import com.company.Entities.Customer;

public class CustomerCheckManager implements CustomerCheackService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
