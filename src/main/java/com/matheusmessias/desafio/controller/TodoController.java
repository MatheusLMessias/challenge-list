package com.matheusmessias.desafio.controller;

import com.matheusmessias.desafio.entity.Todo;
import com.matheusmessias.desafio.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/create")
    List<Todo> create (@Valid @RequestBody Todo todo){
        return todoService.create(todo);
    }
    @GetMapping("list")
    List<Todo> list(){
        return todoService.list();
    }
    @PutMapping("{id}")
    List<Todo> update(@PathVariable Long id, @RequestBody Todo todo) {
        return todoService.update(id, todo);
    }
    @DeleteMapping("/delete/{id}")
    List<Todo> delete (@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
