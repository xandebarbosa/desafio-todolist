package com.alexandre.desafio_todolist.controller;

import com.alexandre.desafio_todolist.entity.Todo;
import com.alexandre.desafio_todolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService; //usamos para executar as operações no controller

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    List<Todo> list() {
        return todoService.list();
    }

    @PutMapping
    List<Todo> update(@RequestBody Todo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }
}
