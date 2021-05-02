package com.company.Concrete;

import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.CustomerCheackService;
import com.company.Entities.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheackService customerCheackService;

    public SturbucksCustomerManager(CustomerCheackService customerCheackService) {
        this.customerCheackService = customerCheackService;
    }



    @Override
    public void Save(Customer customer){
        if (customerCheackService.checkIfRealPerson(customer)){
            super.Save(customer);
        }
        else {
            System.out.println("Customer is Not a valid person!!");
        }


    }

}
