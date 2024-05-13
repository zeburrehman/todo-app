package com.zeb.practice.todoapp.service;

import com.zeb.practice.todoapp.dtos.TodoDto;
import com.zeb.practice.todoapp.model.Todo;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.ArrayList;
import java.util.List;

@Component
public class TodoService {
    private List<Todo> db = new ArrayList<>();

    public List<Todo> getAll() {
        return db;
    }
    public Todo getById(Integer id) throws Exception {
        return db.stream().filter(x -> x.getId() == id).findFirst().orElseThrow(() -> new Exception("Todo with id "+ id +" not found"));
    }
    public Todo create(Todo todo) {
//        var todo = new Todo();
//        todo.setTitle(todoDto.getTitle());
//        todo.setDescription(todoDto.getDescription());
//
//        var currentSize = db.size();
//        todo.setId(currentSize++);
//        todo.setCompleted(false);

        db.add(todo);
        return todo;
    }
}
