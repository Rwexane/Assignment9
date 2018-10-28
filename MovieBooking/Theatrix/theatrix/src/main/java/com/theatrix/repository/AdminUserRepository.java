package com.theatrix.repository;

import com.theatrix.domain.AdminUser;
import org.springframework.data.repository.CrudRepository;

public interface AdminUserRepository extends CrudRepository<AdminUser,Long> {

}
