package com.choi.publicScheduleMange.controller;

import com.choi.publicScheduleMange.model.CompanyMgt;
import com.choi.publicScheduleMange.model.TodoMgt;
import com.choi.publicScheduleMange.service.CompanyService;
import com.choi.publicScheduleMange.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    CompanyService companyService;

    @Autowired
    TodoService todoService;

    @GetMapping("/, /index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "user/login";

    }

    @GetMapping("/register")
    public String register(Model model) {

        List<CompanyMgt> companyList = companyService.findByCompanyList();
        model.addAttribute("companyList", companyList);

        return "user/register";

    }

    @GetMapping("/logout")
    public String logout() {
        return "index";
    }

}
