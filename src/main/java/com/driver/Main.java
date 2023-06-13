package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly ob=new RWOnly();
//        ob.name="shivam";
//        System.out.println(ob.name);
//        java: name has private access in com.driver.RWOnly
        ob.setName("shivam");
        ob.getName();
    }
}