package com.example.board.repository;

import com.example.board.BoardApplicationTests;
import com.example.board.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@Slf4j
public class UserRepositoryTest extends BoardApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void create() {


        User user = User.builder()
                .account("dudxksdl12")
                .password("1111")
                .email("dudxksdl12@naver.com")
                .nicname("너구리")
                .status("REGISTERED")
                .phoneNumber("010-2222-2222")
                .registeredAt(LocalDateTime.now().minusMonths(1))
                .board(boardRepository.getOne(1L))
                .build();

        User newUser = userRepository.save(user);
        Assertions.assertNotNull(newUser);

    }

    @Test
    public void read() {

        userRepository.findAll().stream().forEach(user -> {
            System.out.println(user.getId());
            System.out.println(user.getAccount());
            System.out.println(user.getEmail());
            System.out.println(user.getNicname());
            System.out.println(user.getBoard().getId());
            System.out.println("-------------------------");
        });
    }
}