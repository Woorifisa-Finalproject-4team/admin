package dev.syntax.backend.admin.service;

import dev.syntax.backend.admin.dto.request.AdminRequest;
import dev.syntax.backend.admin.dto.response.AdminResponse;
import dev.syntax.backend.profile.model.User;

import java.util.List;

public interface AdminService extends CrudService<AdminResponse, AdminRequest, Long>{
    List<AdminResponse> findAll();

    AdminResponse findById(Long id);
}
