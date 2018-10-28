package com.theatrix.service.OnlineMovie.ImplService;

import com.theatrix.domain.AdminUser;
import com.theatrix.repository.AdminUserRepository;
import com.theatrix.service.OnlineMovie.AdminUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminUserServicesImpl implements AdminUserServices {

    @Autowired(required = true)
    private AdminUserRepository adminUserRepository;
    @Override
    public AdminUser save(AdminUser id) {
        return adminUserRepository.save(id);
    }
    @Override
    public AdminUser findById(Long aLong) {
        return adminUserRepository.findOne(aLong);
    }
    @Override
    public AdminUser update(AdminUser id) {
        return adminUserRepository.save(id);
    }

    @Override
    public void delete(AdminUser id) {
        adminUserRepository.delete(id);
    }

    @Override
    public void bookMovie(AdminUser id) {

    }
}
