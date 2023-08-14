package dev.syntax.backend.admin.service;

import dev.syntax.backend.admin.dto.response.AdminResponse;
import dev.syntax.backend.admin.repository.AdminRepository;
import dev.syntax.backend.profile.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository){
        this.adminRepository = adminRepository;
    }


    @Override
    public AdminResponse findById(Long id) {
        User user = AdminRepository.findById(id).orElseThrow();
        return AdminResponse.from(user);
    }
}
