package com.pack_j;

public class TemplateClass {
    private String yeet;
    private int int_1;

    public TemplateClass(){
        this("default yeet", -69);
    }

    public TemplateClass(String yeet, int int_1) {
        this.yeet = yeet;
        this.int_1 = int_1;
    }

    public String getYeet() {
        return yeet;
    }

    public int getInt_1() {
        return int_1;
    }

    public void setYeet(String yeet) {
        this.yeet = yeet;
    }

    public void setInt_1(int int_1) {
        this.int_1 = int_1;
    }
}
