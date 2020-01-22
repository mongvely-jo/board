package com.example.board.repository;

import com.example.board.BoardApplicationTests;
import com.example.board.model.entity.Board;
import com.example.board.model.entity.Post;
import com.example.board.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PostRepositoryTest extends BoardApplicationTests {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {

        Optional<User> user = userRepository.findByAccount("dudxksdl");
        Optional<Board> board = boardRepository.findById(1L);

        Post post = Post.builder()
                .title("문의사항입니다")
                .content("수정 부탁드립니다")
                .type("자유게시판")
                .board(board.get())
                .user(user.get())
                .build();

        Post newPost = postRepository.save(post);
        Assertions.assertNotNull(newPost);

    }

    @Test
    public void read() {

        postRepository.findAll().stream().forEach(post -> {
            System.out.println(post.getId());
            System.out.println(post.getTitle());
            System.out.println(post.getContent());
            System.out.println(post.getType());
            System.out.println("board id : " + post.getBoard().getId());
            System.out.println("닉네임 : " + post.getUser().getNicname());
            System.out.println("\n------------------------------------\n");
        });
    }
}