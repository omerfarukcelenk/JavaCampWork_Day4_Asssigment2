package com.company.Adapters;
import java.rmi.RemoteException;

import com.company.Abstract.CustomerCheackService;
import com.company.Entities.Customer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSpap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheackService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {

    }
}
