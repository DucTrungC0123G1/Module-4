package com.example.ss2_bai1.model;

public class Condiment {
    private int id ;
    private String name;

    public Condiment() {
    }

    public Condiment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
