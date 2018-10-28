package com.theatrix.factory;

import com.theatrix.domain.AdminUser;
import com.theatrix.utility.KeyGenerator;

public class AdminUserFactory {

    public static AdminUser buildAdminUser(String firstName, String lastName, String password){

        AdminUser adminUser = new AdminUser.Builder()
                .id(KeyGenerator.getEntityId())
                .nameVal(firstName)
                .surnameVal(lastName)
                .passwordVal(password)
                .build();

        return adminUser;

    }
}
