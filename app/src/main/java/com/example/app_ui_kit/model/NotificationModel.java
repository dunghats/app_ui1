package com.example.app_ui_kit.model;

public class NotificationModel {
    private int id;
    private String title;
    private int image;
    private String time;
    private String name;

    public NotificationModel(int id, String title, int image, String time, String name) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.time = time;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
