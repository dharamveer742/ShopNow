package com.shop.shopNow.repository;

import com.shop.shopNow.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
