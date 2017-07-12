package com.bark.service;

import com.bark.dao.RoleDao;
import com.bark.dao.RoleDaoImpl;
import com.bark.entity.Role;

/**
 * Created by littlebark on 2017/7/12.
 */
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao = new RoleDaoImpl();
    @Override
    public Role createRole(Role role) {
        return roleDao.createRole(role);
    }

    @Override
    public void deleteRole(Long roleId) {
        roleDao.deleteRole(roleId);
    }

    @Override
    public void correlationPermissions(Long roleId, Long... permissionIds) {
        roleDao.correlationPermissions(roleId,permissionIds);
    }

    @Override
    public void uncorrelationPermissions(Long roleId, Long... permissionIds) {
        roleDao.uncorrelationPermissions(roleId,permissionIds);
    }
}
