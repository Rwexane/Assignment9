package com.theatrix.repository;

import com.theatrix.domain.Theatre;
import org.springframework.data.repository.CrudRepository;

public interface TheatreRepository extends CrudRepository<Theatre, Long> {
}
