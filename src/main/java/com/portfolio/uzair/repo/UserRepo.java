package com.portfolio.uzair.repo;

import com.portfolio.uzair.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
