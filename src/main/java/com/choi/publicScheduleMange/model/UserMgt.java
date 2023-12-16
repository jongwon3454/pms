package com.choi.publicScheduleMange.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Getter
@Setter
public class UserMgt implements UserDetails{

    private String loginId;
    private String companyId;
    private String password;
    private String memberName;
    private String memberPhone;
    private String memberEmail;
    private String memberCompany;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        Collection<GrantedAuthority> collections = new ArrayList<>();
//        collections.add(() -> {
//            return user.getRole().name();
//        });

        return null;
    }
/*
    @Override
    public String getPassword() {
        return this.getPassword();
    }*/

    @Override
    public String getUsername() {
        return this.getLoginId();
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
