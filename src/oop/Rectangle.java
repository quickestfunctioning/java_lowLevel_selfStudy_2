package oop;

public class Rectangle {
    int width = 5;
    int height = 8;

    void calculateArea(){
        int a = width*height;
        System.out.println(a);
    }
    void calculatePerimeter(){
        int a = (width+height)*2;
        System.out.println(a);
    }
    void isSquare(){
        boolean a = (width==height);
        System.out.println(a);
    }
}
