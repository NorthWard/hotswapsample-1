package com.lz;


public class TTTT {
    private static final
    String name = "xiaoming";
    private int age;


    public TTTT(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        TTTT byteCodeDeomo = new TTTT(12);
        System.out.println("name:" + name + "age:" + byteCodeDeomo.getAge());
    }

}