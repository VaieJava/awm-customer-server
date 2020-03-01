package com.outdd.awmcustomerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= {"com.outdd"})
@EntityScan(basePackages= {"com.outdd.awmapicustomer.pojo"})
@SpringBootApplication
public class AwmCustomerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwmCustomerServerApplication.class, args);
    }

}
