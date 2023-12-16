package com.choi.publicScheduleMange.service;

import com.choi.publicScheduleMange.model.TodoMgt;

import java.util.List;
import java.util.Objects;

public interface TodoService {

    List<TodoMgt> findByTodoList();

    void insTodoList(TodoMgt todoList);
}
