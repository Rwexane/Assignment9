package com.theatrix.utility;

import java.security.SecureRandom;

public class KeyGenerator {

    public static long getEntityId(){
        SecureRandom rand = new SecureRandom();
        long uniqueNo;

            uniqueNo = 1000 + rand.nextInt(10000);
        return uniqueNo;
    }
}
