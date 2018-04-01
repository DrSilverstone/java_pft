package ru.stqua.pft.sandbox;

public class task2 {

    public static void main(String[] args) {

    Point p1 = new Point(2,4);
    Point p2 = new Point(5,6);

    System.out.println("Расстояние между точками = " + p1.distance(p1.x, p1.y, p2.x, p2.y));
    //System.out.println("Расстояние между точками = " + distance(p1.x, p1.y, p2.x, p2.y));
    }

    /*
    public static double distance(double x1, double y1, double x2, double y2){

        return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
    }
    */
}
