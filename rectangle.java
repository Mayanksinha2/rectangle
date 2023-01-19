package com.internshala;

public class rectangle {
    public static void area(int l, int b){
        System.out.println("The area of rectangle is :" + l* b);
    }

    public static void perimeter(int l, int b){
        System.out.println("The perimeter of rectangle is :" + 2*(l + b) );
    }
    public static void main(String[] args) {
        int length = 40;
        int breadth = 20;
        area(length,breadth);
        perimeter(length,breadth);
    }
}
