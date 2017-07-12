package com.bark.service;

import com.bark.dao.PermissionDao;
import com.bark.dao.PermissionDaoImpl;
import com.bark.entity.Permission;

/**
 * Created by littlebark on 2017/7/12.
 */
public class PermissionServiceImpl implements PermissionService {
    private PermissionDao permissionDao = new PermissionDaoImpl();

    @Override
    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    @Override
    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }
}
