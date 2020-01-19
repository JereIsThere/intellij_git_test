package com.pack_j;

public class Main {

    public static void main(String[] args) {
        OuterClass.InnerClass.Help what = new OuterClass().new InnerClass().new Help();
        System.out.println(new OuterClass().getHelpFromOuterClassFromInnerClassFromHelp());
    }
}
