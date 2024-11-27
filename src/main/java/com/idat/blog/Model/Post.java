package com.idat.blog.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPost;
    private String ContentPost;
    private Date DatePost;

    @ManyToOne
    @JoinColumn(name = "Id_User")
    private User user;

    public Post() {
    }

    public Post(String contentPost, Date datePost) {
        ContentPost = contentPost;
        DatePost = datePost;
    }

    public Long getIdPost() {
        return IdPost;
    }

    public void setIdPost(Long idPost) {
        IdPost = idPost;
    }

    public String getContentPost() {
        return ContentPost;
    }

    public void setContentPost(String contentPost) {
        ContentPost = contentPost;
    }

    public Date getDatePost() {
        return DatePost;
    }

    public void setDatePost(Date datePost) {
        DatePost = datePost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
