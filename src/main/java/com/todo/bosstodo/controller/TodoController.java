package com.todo.bosstodo.controller;

import com.todo.bosstodo.entitly.Todo;
import com.todo.bosstodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo")
    public List<Todo> getAllTodos(){
        return todoService.getAllToDos();
    }

    @PostMapping("/todo")
    public Todo saveTodo(@RequestBody Todo todo ){
        return todoService.addTodo( todo);
    }

    @PutMapping("/todo")
    public Todo updateTodo(@RequestBody Todo todo ){
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/todo/{id}")
    public void deleteTodo(@PathVariable Integer id ){
        todoService.deleteTodo(id);
    }
}
