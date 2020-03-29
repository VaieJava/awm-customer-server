package com.outdd.customer.dao;


import com.outdd.awmapicustomer.pojo.Permission;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Nicky on 2017/12/3.
 */
public interface PermissionPageRepository extends PagingAndSortingRepository<Permission,Integer> {

}
