package com.toystory.andy.service.system.auth.role;

import javax.management.relation.Role;
import java.util.List;

public interface RoleService {

    List<Role> findAll();

    List<Role> findAllHierarchy();

    Role findByCode(String code);

    void save(Role role);

    void update(Role role);

    void deleteByCode(String code);

    void initRoles();
}
