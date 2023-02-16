package com.todo.bosstodo.service;

import com.todo.bosstodo.entitly.Todo;
import com.todo.bosstodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Transactional
    public Todo addTodo( Todo todo ){
        return todoRepository.save(todo);
    }

    @Transactional
    public List<Todo> getAllToDos(){
        List<Todo> topics = new ArrayList<>();
        todoRepository.findAll().forEach(topics::add);
        return topics;
    }

    @Transactional
    public Todo getTodoById( Integer id ){
        return todoRepository.findById( id ).get();
    }

    @Transactional
    public Todo updateTodo( Todo todo ){
        return todoRepository.save(todo);
    }

    @Transactional
    public void deleteTodo( Integer id ){
        todoRepository.deleteById(id);
    }
}
