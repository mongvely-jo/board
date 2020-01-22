package com.example.board.repository;

import com.example.board.BoardApplicationTests;
import com.example.board.model.entity.Board;
import com.example.board.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
public class BoardRepositoryTest extends BoardApplicationTests {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        Board board = Board.builder()
                .page(2)
                .build();

        Board newBoard = boardRepository.save(board);
        Assertions.assertNotNull(newBoard);
    }

    @Test
    @Transactional
    public void read() {

        boardRepository.findAll().stream().forEach(board -> {
            System.out.println(board.getId());
            List<User> userList = board.getUserList();
            userList.stream().forEach(user -> {
                System.out.println(user.getNicname());
            });
            System.out.println("-----------------");
        });
    }
}