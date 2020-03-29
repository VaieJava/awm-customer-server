package com.outdd.customer.dao;


import com.outdd.awmapicustomer.pojo.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Nicky on 2017/7/30.
 */
public interface RolePageRepository extends PagingAndSortingRepository<Role, Integer> {

}
