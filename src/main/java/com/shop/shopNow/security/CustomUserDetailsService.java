package com.shop.shopNow.security;

import com.shop.shopNow.entity.User;
import com.shop.shopNow.exception.NotFoundException;
import com.shop.shopNow.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService {
    private final UserRepo userRepo;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username)
                .orElseThrow( ()-> new NotFoundException("User / Email not found"));

        return AuthUser.builder().user(user).build();
    }
}
