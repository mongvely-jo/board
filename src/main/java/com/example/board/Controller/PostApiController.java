package com.example.board.Controller;

import com.example.board.model.entity.Post;
import com.example.board.model.network.request.PostApiRequest;
import com.example.board.model.network.response.PostApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class PostApiController extends CrudController<PostApiResponse, PostApiRequest, Post> {
}
