package com.shop.shopNow.repository;

import com.shop.shopNow.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
