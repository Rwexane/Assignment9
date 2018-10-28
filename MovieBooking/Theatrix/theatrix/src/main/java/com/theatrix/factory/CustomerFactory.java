package com.theatrix.factory;

import com.theatrix.domain.Customer;
import com.theatrix.utility.KeyGenerator;

public class CustomerFactory {

    public static Customer buildCustomer(String name, String surname, String cellphone, String email, String age, String password){

        Customer customer = new Customer.Builder()
                .id(KeyGenerator.getEntityId())
                .nameVal(name)
                .surnameVal(surname)
                .phoneNumVal(cellphone)
                .emailVal(email)
                .ageVal(age)
                .passwordVal(password)
                .build();

        return customer;
    }

    /*public static Pharmacist updatePharmacy(long pharmacyId,String pharmacistName, String quailification){

        Pharmacist pharmacist = new Pharmacist.Builder()
                .pharmacistID(pharmacyId)
                .pharmacistName(pharmacistName)
                .qualification(quailification)
                .build();

        return pharmacist;
    }*/
}
