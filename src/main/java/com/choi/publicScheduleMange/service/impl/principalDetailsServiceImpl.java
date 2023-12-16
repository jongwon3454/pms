package com.choi.publicScheduleMange.service.impl;

import com.choi.publicScheduleMange.mapper.UserMapper;
import com.choi.publicScheduleMange.model.UserDetail;
import com.choi.publicScheduleMange.model.UserMgt;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class principalDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserMapper userMapper;


    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        UserMgt user = userMapper.findByLoginId(loginId)
                .orElseThrow(() -> {
                    return new UsernameNotFoundException("해당 유저를 찾을수 없습니다.");
                });
        return new UserDetail(user);
    }
}
