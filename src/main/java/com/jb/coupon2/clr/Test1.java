package com.jb.coupon2.clr;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@RequiredArgsConstructor
public class Test1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("my name is guy");
    }
}
