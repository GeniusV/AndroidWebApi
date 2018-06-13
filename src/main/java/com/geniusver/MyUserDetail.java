package com.geniusver;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * Created by GeniusV on 6/13/18.
 */
public class MyUserDetail  implements UserDetails{
    private String id;
    private String password;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public MyUserDetail(String id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return id;
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
}
