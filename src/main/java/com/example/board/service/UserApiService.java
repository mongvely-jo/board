package com.example.board.service;

import com.example.board.model.entity.User;
import com.example.board.model.network.Header;
import com.example.board.model.network.request.UserApiRequest;
import com.example.board.model.network.response.UserApiResponse;

public class UserApiService extends BaseService<UserApiResponse, UserApiRequest, User> {

    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header<UserApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header<UserApiResponse> delete(Long id) {
        return null;
    }
}
