package com.codewithme.mobile_app_ws.service;

import com.codewithme.mobile_app_ws.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
}
