package com.jb.coupon2.repositories;

import com.jb.coupon2.beans.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
