package com.example.app_ui_kit;

public class DiscoverModel {

    private int image;
    private String title;
    private String time;
    private String name;

    public DiscoverModel(int image, String title, String time, String name) {
        this.image = image;
        this.title = title;
        this.time = time;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
