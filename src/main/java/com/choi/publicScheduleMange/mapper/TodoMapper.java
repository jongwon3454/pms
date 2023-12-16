package com.choi.publicScheduleMange.mapper;

import com.choi.publicScheduleMange.model.TodoMgt;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Mapper
@Repository
public interface TodoMapper {

    List<TodoMgt> findByTodoList();

    void insTodoList(TodoMgt todoList);
}
