package com.example.board.Controller;

import com.example.board.model.entity.AdminUser;
import com.example.board.model.network.request.AdminUserApiRequest;
import com.example.board.model.network.response.AdminUserApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/adminUser")
public class AdminUserApiController extends CrudController<AdminUserApiResponse, AdminUserApiRequest, AdminUser> {

}
