package com.theatrix.factory;

import com.theatrix.domain.Theatre;
import com.theatrix.utility.KeyGenerator;

public class TheatreFactory {

    public static Theatre buildTheatre(String name, String address, String maxAdience, String minAdience, Long showId){

        Theatre theatre = new Theatre.Builder()
                .id(KeyGenerator.getEntityId())
                .nameVal(name)
                .addressVal(address)
                .maxAdienceVal(maxAdience)
                .minAdienceVal(minAdience)
                .showIdVal(showId)
                .build();

        return theatre;
    }
}
