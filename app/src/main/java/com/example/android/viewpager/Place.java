package com.example.android.viewpager;

public class Place {

    private String mName;
    private String mLocation;
    private String mContact;
    private int mImage;

    public Place(String name, String location, String contact, int image){
        mName = name;
        mLocation = location;
        mContact = contact;
        mImage = image;
    }

    public String getName(){
        return mName;
    }

    public String getLocation(){
        return mLocation;
    }

    public String getContact(){
        return mContact;
    }

    public int getImage(){
        return mImage;
    }
}
