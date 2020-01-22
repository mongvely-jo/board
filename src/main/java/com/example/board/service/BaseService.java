package com.example.board.service;

import com.example.board.ifs.CrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseService<Res, Req, Entity> implements CrudInterface<Res, Req> {

    @Autowired(required = false)
    protected JpaRepository<Entity,Long> baseRepository;

}
