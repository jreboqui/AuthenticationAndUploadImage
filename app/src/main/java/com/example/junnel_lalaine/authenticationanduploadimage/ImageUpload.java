package com.example.junnel_lalaine.authenticationanduploadimage;

/**
 * Created by Junnel_Lalaine on 5/29/2017.
 */

public class ImageUpload {

    public String name;
    public String url;
    public String userId;

    public String getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }

    public String getUrl() {
        return url;
    }

    public ImageUpload(String name, String url, String userId) {
        this.name = name;
        this.url = url;
        this.userId = userId;
    }
}
