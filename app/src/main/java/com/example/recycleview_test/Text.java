package com.example.recycleview_test;

import android.media.Image;

public class Text {
        private String name;
        private String time;
        private String message;
        private int imageId;

    public Text(String ava, int imageId) {
        this.name=name;
        this.imageId=imageId;
    }

    public Text() {

    }


    public int getImageId() {
        return imageId;
    }

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

    }


