package com.zeb.practice.todoapp;

import com.zeb.practice.todoapp.dtos.TodoDto;
import com.zeb.practice.todoapp.model.Todo;
import com.zeb.practice.todoapp.service.TodoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo")
    List<Todo> getAll(){
        return todoService.getAll();
    }

    @GetMapping("/todo/{id}")
    Todo getById(@PathVariable("id") Integer id) throws Exception {
        return todoService.getById(id);
    }

    @PostMapping("/todo")
    Todo create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }
}
