package com.example.board.ifs;

import com.example.board.model.network.Header;

public interface CrudInterface<Res, Req> {
    Header<Res> create(Header<Req> request);

    Header<Res> read(Long id);

    Header<Res> update(Header<Req> request);

    Header<Res> delete(Long id);
}
