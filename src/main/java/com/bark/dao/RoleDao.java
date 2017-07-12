package com.bark.dao;

import com.bark.entity.Role;

/**
 * Created by littlebark on 2017/7/12.
 */
public interface RoleDao {
    public Role createRole(Role role);
    public void deleteRole(Long roleId);

    public void correlationPermissions(Long roleId, Long... permissionIds);
    public void uncorrelationPermissions(Long roleId, Long... permissionIds);
}
