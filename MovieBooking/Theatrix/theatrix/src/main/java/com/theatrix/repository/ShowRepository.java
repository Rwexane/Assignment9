package com.theatrix.repository;

import com.theatrix.domain.Show;
import org.springframework.data.repository.CrudRepository;

public interface ShowRepository extends CrudRepository<Show, Long> {
}
