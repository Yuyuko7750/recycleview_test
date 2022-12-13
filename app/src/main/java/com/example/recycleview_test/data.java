package com.example.recycleview_test;

import android.media.Image;

public class data {
    private String name;
    private String time;
    private String message;
    private Image picture;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Image getPicture() {
        return picture;
    }
}
