package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when23To20Then3() {
        Point a = new Point(2, 3);
        Point b = new Point(2, 0);
        double expected = 3;
        double rsl = a.distance(b);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void when22To62Then4() {
        Point a = new Point(2, 2);
        Point b = new Point(6, 2);
        double expected = 4;
        double rsl = a.distance(b);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void when29To66Then5() {
        Point a = new Point(2, 9);
        Point b = new Point(6, 6);
        double expected = 5;
        double rsl = a.distance(b);
        assertThat(rsl).isEqualTo(expected);
    }
}