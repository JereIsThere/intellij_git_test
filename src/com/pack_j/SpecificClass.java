package com.pack_j;

public class SpecificClass extends TemplateClass {

    private int int_2;
    private String yeet_2;

    public SpecificClass(String yeet, int int_1, int int_2, String yeet_2) {
        super(yeet, int_1);
        this.int_2 = int_2;
        this.yeet_2 = yeet_2;
    }

    public SpecificClass() {
        this(-420, "default yeet 2");
    }

    public SpecificClass(int int_2, String yeet_2) {
        this("default yeet", -69, int_2, yeet_2);
    }

    public int getInt_2() {
        return int_2;
    }

    public void setInt_2(int int_2) {
        this.int_2 = int_2;
    }

    public String getYeet_2() {
        return yeet_2;
    }

    public void setYeet_2(String yeet_2) {
        this.yeet_2 = yeet_2;
    }

    public String testMethod() {
        return super.getYeet();
    }
}
