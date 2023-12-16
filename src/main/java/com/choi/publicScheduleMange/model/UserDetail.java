package com.choi.publicScheduleMange.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class UserDetail implements org.springframework.security.core.userdetails.UserDetails {

    private final UserMgt user;

    public UserDetail(UserMgt user) {
        this.user = user;
    }
        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
//        Collection<GrantedAuthority> collections = new ArrayList<>();
//        collections.add(() -> {
//            return user.getRole().name();
//        });

            return null;
        }

        @Override
        public String getPassword() {
            return user.getPassword();
        }

        @Override
        public String getUsername() {
            return user.getLoginId();
        }

        // 계정만료여부 (true 만료x)
        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        // 계정잠김여부 (true 잠김x)
        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        // 비밀번호 만료 (true 만료x)
        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        // 계정활성화(true 활성화)
        @Override
        public boolean isEnabled() {
            return true;
        }
}
