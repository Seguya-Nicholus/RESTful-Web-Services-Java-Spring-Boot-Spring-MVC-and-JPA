package com.codewithme.mobile_app_ws.repository;

import com.codewithme.mobile_app_ws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}
