package com.igor.sch;

public class Main {
    public static void main(String[] args) {
        Triangle triangleOne = new Triangle();
        System.out.println(triangleOne.area());

        Triangle triangleTwo = new Triangle(5,4,2);
        System.out.println(triangleTwo.area());


    }
}
