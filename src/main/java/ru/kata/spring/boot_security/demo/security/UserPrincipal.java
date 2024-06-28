package ru.kata.spring.boot_security.demo.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.Collection;
import java.util.Set;

public class UserPrincipal implements UserDetails {

    private User user;


    public UserPrincipal(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getRoles();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }


    public Set<Role> getRoles() {
        return user.getRoles();
    }

    public void setRoles(Set<Role> roles) {
        this.user.setRoles(roles);
    }

    public Long getId() {
        return user.getId();
    }

    public void setId(Long id) {
        this.user.setId(id);
    }


    public String getSurname() {
        return user.getSurname();
    }

    public void setSurname(String surname) {
        this.user.setSurname(surname);
    }

    public void setUsername(String username) {
        this.user.setUsername(username);
    }

    public User getUser() {
        return user;
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
