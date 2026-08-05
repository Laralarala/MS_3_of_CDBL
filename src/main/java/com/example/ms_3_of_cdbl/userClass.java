package com.example.ms_3_of_cdbl;

public class userClass {
    private String id;
    private String password;

    public userClass(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "userClass{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
