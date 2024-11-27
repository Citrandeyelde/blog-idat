package com.idat.blog.Model;

import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdComment;
    private String ContentComment;

    @ManyToOne
    @JoinColumn(name="Id_User")
    private User user;

    @ManyToOne
    @JoinColumn(name="Id_Post")
    private Post Post;

    public Comment (){

    }
    public Comment(String contentComment) {
        ContentComment = contentComment;
    }

    public Long getIdComment() {
        return IdComment;
    }

    public void setIdComment(Long idComment) {
        IdComment = idComment;
    }

    public String getContentComment() {
        return ContentComment;
    }

    public void setContentComment(String contentComment) {
        ContentComment = contentComment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public com.idat.blog.Model.Post getPost() {
        return Post;
    }

    public void setPost(com.idat.blog.Model.Post post) {
        Post = post;
    }
}
