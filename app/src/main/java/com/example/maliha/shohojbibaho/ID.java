package com.example.maliha.shohojbibaho;

public class ID {
    private int id;
    private String unique;

    public ID(int id, String unique) {
        this.id = id;
        this.unique = unique;
    }

    public ID() {
    }

    public int getID() {
        return id;
    }

    public String getUnique() {
        return unique;
    }
}
