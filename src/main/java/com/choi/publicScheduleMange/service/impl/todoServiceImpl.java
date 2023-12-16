package com.choi.publicScheduleMange.service.impl;

import com.choi.publicScheduleMange.mapper.TodoMapper;
import com.choi.publicScheduleMange.model.TodoMgt;
import com.choi.publicScheduleMange.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class todoServiceImpl implements TodoService{

    @Autowired
    TodoMapper todoMapper;


    @Override
    public List<TodoMgt> findByTodoList() {
        return todoMapper.findByTodoList();
    }

    @Override
    public void insTodoList(TodoMgt todoList) {
        todoMapper.insTodoList(todoList);

    }

}
