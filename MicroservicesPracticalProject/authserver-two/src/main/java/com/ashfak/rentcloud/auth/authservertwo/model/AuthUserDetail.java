package com.ashfak.rentcloud.auth.authservertwo.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public class AuthUserDetail extends User implements UserDetails {

    public AuthUserDetail(User user) {
        super(user);
    }

    public AuthUserDetail() {

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        List<GrantedAuthority> grantAuthority = new ArrayList<>();

        getRoles().forEach(role -> {
            grantAuthority.add(new SimpleGrantedAuthority(role.getName()));
            role.getPermissions().forEach(permission -> {
                //add permissions to the same list
               grantAuthority.add(new SimpleGrantedAuthority(permission.getName()));
           });
        });

        return grantAuthority;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return  super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled();
    }

}
