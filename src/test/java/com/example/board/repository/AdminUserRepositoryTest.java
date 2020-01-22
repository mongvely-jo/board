package com.example.board.repository;

import com.example.board.BoardApplicationTests;
import com.example.board.model.entity.AdminUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
public class AdminUserRepositoryTest extends BoardApplicationTests {

    @Autowired
    private AdminUserRepository adminUserRepository;

    @Test
    public void create() {

        AdminUser adminUser = AdminUser.builder()
                .account("tkdvlf11")
                .password("99999")
                .status("REGISTERED")
                .role("MASTER")
                .lastLoginAt(LocalDateTime.now().minusDays(2))
                .registeredAt(LocalDateTime.now().minusDays(10))
                .build();

        AdminUser newAdminUser = adminUserRepository.save(adminUser);
        Assertions.assertNotNull(newAdminUser);

    }

    @Test
    public void read() {

        adminUserRepository.findAll().stream()
                .forEach(adminUser -> {
                    System.out.println(adminUser.getId());
                    System.out.println(adminUser.getAccount());
                    System.out.println(adminUser.getStatus());
                    System.out.println(adminUser.getLastLoginAt());
                    System.out.println("-----------------------------");
                });
    }

    @Test
    public void readByAccount() {
        Optional<AdminUser> adminUser = adminUserRepository.findByAccount("dudxksdl13");

        log.info("{}",adminUser);

    }

    @Test
    public void update() {

        Optional<AdminUser> adminUser =  adminUserRepository.findById(1L);
        adminUser.ifPresent(adminUser1 -> {
            adminUser1.setAccount("dudxksdl12");
            adminUserRepository.save(adminUser1);
        });
    }

    @Test
    public void delete() {

        Optional<AdminUser> adminUser = adminUserRepository.findByAccount("tkdvlf11");

        adminUser.ifPresent(adminUser1 -> {
            adminUserRepository.delete(adminUser1);
        });
    }
}
