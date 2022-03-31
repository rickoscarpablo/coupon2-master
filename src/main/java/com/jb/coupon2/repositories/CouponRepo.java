package com.jb.coupon2.repositories;

import com.jb.coupon2.beans.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepo extends JpaRepository<Coupon,Integer> {
}
