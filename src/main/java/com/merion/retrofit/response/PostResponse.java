package com.merion.retrofit.response;

public class PostResponse {
    private Integer id;
    private Integer userId;
    private String body;
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "\nPostResponse{" +
                "id=" + id +
                ", userId=" + userId +
                ", \nbody='" + body + '\'' +
                ", \ntitle='" + title + '\'' +
                '}';
    }
}



