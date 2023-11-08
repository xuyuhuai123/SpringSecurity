package com.in.action.config;

import com.sun.tools.javac.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class SimpleUser implements UserDetails {

    private final String username;

    private final String password;

    public SimpleUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of((GrantedAuthority) () -> "READ");
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

//    public UserDetails createUserDetails() {
//        User.UserBuilder builder = User.withUsername("bill");
//        UserDetails u1 = builder.password("12345")
//                .authorities("read", "write")
//                .passwordEncoder(p -> encode(p))
//                .accountExpired(false)
//                .disabled(true)
//                .build();
//        User.UserBuilder builder2 = User.withUserDetails(u1);
//        UserDetails u2 = builder2.build();
//        return u2;
//    }
}
