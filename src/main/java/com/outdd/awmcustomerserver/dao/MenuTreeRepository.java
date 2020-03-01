package com.outdd.awmcustomerserver.dao;


import com.outdd.awmapicustomer.pojo.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Nicky on 2017/6/17.
 */
public interface MenuTreeRepository extends JpaRepository<Menu,Integer> {

}
