package com.idat.blog.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;
    private String NomUser;
    private String EmailUser;
    private Boolean Active;
    private String Password;
    private String Role;

    public User(String nomUser, String emailUser, Boolean active, String password, String role) {
        NomUser = nomUser;
        EmailUser = emailUser;
        Active = active;
        Password = password;
        Role = role;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public String getNomUser() {
        return NomUser;
    }

    public void setNomUser(String nomUser) {
        NomUser = nomUser;
    }

    public String getEmailUser() {
        return EmailUser;
    }

    public void setEmailUser(String emailUser) {
        EmailUser = emailUser;
    }

    public Boolean getActive() {
        return Active;
    }

    public void setActive(Boolean active) {
        Active = active;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
