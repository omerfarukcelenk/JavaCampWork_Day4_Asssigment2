package com.company;

import com.company.Abstract.BaseCustomerManager;
import com.company.Concrete.NeroCustomerManager;
import com.company.Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Ömer faruk");
        customer1.setLastName("Çelenk");
        customer1.setDateOfBirth(new Date(2000,12,12));
        customer1.setNationalityId("12345678910");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Luna");
        customer2.setLastName("Çelenk");
        customer2.setDateOfBirth(new Date(2020,11,10));
        customer2.setNationalityId("98765432102");


        BaseCustomerManager neroCustomerManager= new NeroCustomerManager();
        neroCustomerManager.Save(customer1);
    }
}
