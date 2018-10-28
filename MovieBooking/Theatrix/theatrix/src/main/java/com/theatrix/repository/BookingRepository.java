package com.theatrix.repository;

import com.theatrix.domain.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking,Long> {

}
