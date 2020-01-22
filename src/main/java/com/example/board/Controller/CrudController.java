package com.example.board.Controller;

import com.example.board.ifs.CrudInterface;
import com.example.board.model.network.Header;
import com.example.board.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CrudController<Res, Req, Entity> implements CrudInterface<Res, Req> {

    @Autowired(required = false)
    private BaseService<Res, Req, Entity> baseService;

    @Override
    @PostMapping("")
    public Header<Res> create(@RequestBody Header<Req> request) {
        return baseService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<Res> read(@PathVariable Long id) {
        return baseService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<Res> update(@RequestBody Header<Req> request) {
        return baseService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header<Res> delete(@PathVariable Long id) {
        return baseService.delete(id);
    }
}