package com.example.moshipractice;

public class User {
    private String name;
    private String city;
    private float weight;
    private int age;
    private boolean isActive;

    public User() {

    }

    public User(String name, String city, float weight, int age, boolean isActive){
        this.name = name;
        this.city = city;
        this.weight = weight;
        this.age = age;
        this.isActive = isActive;
    }
}
