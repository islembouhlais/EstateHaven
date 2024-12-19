package project.app.demo.user;

import java.sql.Timestamp;


public class userEntity {

    protected int user_id;
    protected String username;
    protected String email;
    protected String password_hash;
    protected Timestamp created_at;

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public String getPassword_hash() {
        return password_hash;
    }
}
