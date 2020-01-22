package com.example.board.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetController {

    @GetMapping("/getParameter")
    public String create(@RequestParam String id, @RequestParam String name) {
        return id + name;
    }
}
