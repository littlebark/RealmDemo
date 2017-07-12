package com.bark.service;

import com.bark.entity.Permission;

/**
 * Created by littlebark on 2017/7/12.
 */
public interface PermissionService {
    public Permission createPermission(Permission permission);
    public void deletePermission(Long permissionId);
}
