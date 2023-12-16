package com.choi.publicScheduleMange.controller;

import com.choi.publicScheduleMange.model.Calendar;
import com.choi.publicScheduleMange.model.TodoMgt;
import com.choi.publicScheduleMange.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Objects;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/todo/findByTodoList")
    @ResponseBody
    public List<TodoMgt> findByTodoList() {
        List<TodoMgt> todoList = todoService.findByTodoList();
        return todoList;
    }

    @PostMapping("/todo/insTodoList")
    public String insTodoList(Calendar eventData) {
        TodoMgt todoList = new TodoMgt();
        todoList.setTodoContent(eventData.getTitle());
        todoList.setTodoStartDate(eventData.getStart());
        todoList.setTodoEndDate(eventData.getEnd());

        todoService.insTodoList(todoList);

        return "redirect:/";
    }
}
