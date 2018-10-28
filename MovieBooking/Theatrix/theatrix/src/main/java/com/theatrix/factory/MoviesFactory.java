package com.theatrix.factory;

import com.theatrix.domain.Movie;
import com.theatrix.utility.KeyGenerator;

public class MoviesFactory {

    public static Movie buildMovie(String name, String category, String duration, String yearRelease, String ageRestriction){

       Movie movies = new Movie.Builder()
               .idVal(KeyGenerator.getEntityId())
               .nameVal(name)
               .categoryVal(category)
               .durationVal(duration)
               .yearReleaseVal(yearRelease)
               .ageRestrictionVal(ageRestriction)
               .build();

       return movies;
    }

    /*public static Medicine updateMedicine(long medicineID, String medicineName, double medicinePrice,int quantity, String medicineDetails){

        Medicine medicine = new Medicine.Builder()
                .medicineId(medicineID)
                .medicineName(medicineName)
                .medicinePrice(medicinePrice)
                .quantity(quantity)
                .details(medicineDetails)
                .build();

        return medicine;
    }*/
}
