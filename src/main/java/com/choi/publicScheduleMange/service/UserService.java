package com.choi.publicScheduleMange.service;

import com.choi.publicScheduleMange.model.UserDetail;
import com.choi.publicScheduleMange.model.UserMgt;

public interface UserService {
    void register(UserMgt user);

    /*UserDetail getLoginUserByLoginId(String name);*/
}
