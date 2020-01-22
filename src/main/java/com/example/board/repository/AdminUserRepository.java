package com.example.board.repository;

import com.example.board.model.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminUserRepository extends JpaRepository<AdminUser,Long> {

    Optional<AdminUser> findByAccount(String account);
}
