package com.example.board.service;

import com.example.board.model.entity.Board;
import com.example.board.model.network.Header;
import com.example.board.model.network.request.BoardApiRequest;
import com.example.board.model.network.response.BoardApiResponse;

public class BoardApiService extends BaseService<BoardApiResponse, BoardApiRequest, Board> {

    @Override
    public Header<BoardApiResponse> create(Header<BoardApiRequest> request) {
        BoardApiRequest body = request.getData();

        Board board = Board.builder()
                .id(body.getId())
                .page(body.getPage())
                .build();
        return Header.OK(response(board));
    }

    @Override
    public Header<BoardApiResponse> read(Long id) {

        return baseRepository.findById(id)
                .map(this::response)
                .map(Header::OK)
                .orElseGet(Header::ERROR);

    }

    @Override
    public Header<BoardApiResponse> update(Header<BoardApiRequest> request) {
        return null;
    }

    @Override
    public Header<BoardApiResponse> delete(Long id) {
        return null;
    }

    public BoardApiResponse response(Board board) {
        return BoardApiResponse.builder()
                .id(board.getId())
                .page(board.getPage())
                .build();
    }
}


