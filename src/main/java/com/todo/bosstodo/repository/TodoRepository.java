package com.todo.bosstodo.repository;

import com.todo.bosstodo.entitly.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
