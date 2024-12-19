package com.example.SecurityTutorial.config;

import com.example.SecurityTutorial.model.Person;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails implements UserDetails {

    String username;
    String password;
    List<GrantedAuthority> authorities;

    public CustomUserDetails(Person person) {
        this.username = person.getUsername();
        this.password = person.getPassword();
        String[] roles = person.getRoles().split(",");
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for(String role: roles) {
            SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(role);
            grantedAuthorities.add(simpleGrantedAuthority);
        }
        this.authorities = grantedAuthorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
