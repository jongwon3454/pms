package com.choi.publicScheduleMange.mapper;

import com.choi.publicScheduleMange.model.UserMgt;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Mapper
@Repository
public interface UserMapper {

    //회원가입
    void register(UserMgt user);

    // 시큐리티로그인
    Optional<UserMgt> findByLoginId(String loginId);

}
