package dev.syntax.backend.admin.repository;

import dev.syntax.backend.admin.model.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Long> {

}
