package example.android.myapplication.model;


import java.util.Date;

public class Comment {

    private int id;

    private String body;

    private Date createdAt;

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}