package com.choi.publicScheduleMange.controller;

import com.choi.publicScheduleMange.model.CompanyMgt;
import com.choi.publicScheduleMange.model.UserMgt;
import com.choi.publicScheduleMange.service.CompanyService;
import com.choi.publicScheduleMange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/*@Controller*/
@RestController
public class UserApiController {

    @Autowired
    UserService userService;

    @Autowired
    CompanyService companyService;

    @PostMapping("/register")
    public void register(UserMgt user, HttpServletResponse response) throws IOException {
        userService.register(user);

        String redirectUri = "/login";
        response.sendRedirect(redirectUri);
    }

/*
    @PostMapping("/login")
    public void login(Model model, Authentication auth, HttpServletResponse response) throws IOException {
        String redirectUri = "http://localhost:9090/";

        if(auth != null) {
            UserDetail loginUser = userService.getLoginUserByLoginId(auth.getName());
            if(loginUser != null) {
                model.addAttribute("nickname", loginUser.getUsername());
            }
        }
        response.sendRedirect(redirectUri);
    }*/

    // https://velog.io/@albaneo0724/Spring-RestController-%ED%81%B4%EB%9E%98%EC%8A%A4%EC%97%90%EC%84%9C-%EB%A6%AC%EB%8B%A4%EC%9D%B4%EB%A0%89%ED%8A%B8-%EC%8B%9C%ED%82%A4%EB%8A%94-%EB%B0%A9%EB%B2%95
}
