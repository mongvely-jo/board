package com.example.board.Controller;

import com.example.board.model.entity.User;
import com.example.board.model.network.request.UserApiRequest;
import com.example.board.model.network.response.UserApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiResponse, UserApiRequest, User> {
}
