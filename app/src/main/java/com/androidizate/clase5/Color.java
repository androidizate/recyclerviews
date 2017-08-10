package com.androidizate.clase5;

/**
 * Created by Andres Oller.
 */
public class Color {

    private String name;
    private String hex;
    private int value;


    public Color(String name, String hex, int value) {
        this.value = value;
        this.hex = hex;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}