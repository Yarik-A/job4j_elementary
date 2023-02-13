package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when23To20Then3() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 2;
        int y2 = 0;
        double expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22To62Then4() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 6;
        int y2 = 2;
        double expected = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when29To66Then5() {
        int x1 = 2;
        int y1 = 9;
        int x2 = 6;
        int y2 = 6;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}