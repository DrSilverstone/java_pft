package ru.stqua.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testDistance(){

        Point p1 = new Point(5,4);
        Point p2 = new Point(5,4);
        Point p3 = new Point(6,4);
        Point p4 = new Point(5,5);
        Point p5 = new Point(0,0);
        Point p6 = new Point(1,0);


        Assert.assertEquals(p1.distance(p1),0.); // the same point, distance have to be 0.
        Assert.assertEquals(p1.distance(p2),0.); // equal points, distance have to be 0.
        Assert.assertEquals(p1.distance(p3),1.); // different points, sift at x axis , distance have to be 1.
        Assert.assertEquals(p1.distance(p4),1.); // different points, sift at y axis , distance have to be 1.



        // different points, to (0,0), different calculations

        double lenTo00Calculation1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y); // simple calculation
        Assert.assertEquals(p1.distance(p5),lenTo00Calculation1);

        double lenTo00Calculation2 = Math.sqrt((p5.x - p1.x) * (p5.x - p1.x)  + (p5.y - p1.y) * (p5.y - p1.y));
        Assert.assertEquals(p1.distance(p5),lenTo00Calculation2);   // long  calculation

        double lenTo00Calculation3 = Math.sqrt(Math.pow((p5.x - p1.x), 2)  + Math.pow((p5.y - p1.y), 2) );
        Assert.assertEquals(p1.distance(p5),lenTo00Calculation3);   // calculation as it was in distance function



        // different points, random distance.

        double len = Math.sqrt(Math.pow((p6.x - p1.x), 2)  + Math.pow((p6.y - p1.y), 2) );
        Assert.assertEquals(p1.distance(p6),len);
    }

}