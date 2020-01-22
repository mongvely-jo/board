package com.example.board.service;

import com.example.board.model.entity.Post;
import com.example.board.model.network.Header;
import com.example.board.model.network.request.PostApiRequest;
import com.example.board.model.network.response.PostApiResponse;

public class PostApiService extends BaseService<PostApiResponse, PostApiRequest, Post> {

    @Override
    public Header<PostApiResponse> create(Header<PostApiRequest> request) {
        return null;
    }

    @Override
    public Header<PostApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<PostApiResponse> update(Header<PostApiRequest> request) {
        return null;
    }

    @Override
    public Header<PostApiResponse> delete(Long id) {
        return null;
    }
}
