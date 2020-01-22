package com.example.board.Controller;

import com.example.board.model.entity.Board;
import com.example.board.model.network.request.BoardApiRequest;
import com.example.board.model.network.response.BoardApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board")
public class BoardApiController extends CrudController<BoardApiResponse, BoardApiRequest, Board> {

}
