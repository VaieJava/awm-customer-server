package com.outdd.awmcustomerserver.dao;


import com.outdd.awmapicustomer.pojo.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Nicky on 2017/12/2.
 */
public interface UserRoleRepository extends JpaRepository<RolePermission,String> {
}
