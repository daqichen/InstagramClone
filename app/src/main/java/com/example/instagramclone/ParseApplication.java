package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("i7G8bCJmvYqpY4tJWfmeasGivkwIT1RCVu0InGji")
                .clientKey("ysxbYpPBZ8qSNEc0OKOmZkU6fqUoq3oZC50qG0ph")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}