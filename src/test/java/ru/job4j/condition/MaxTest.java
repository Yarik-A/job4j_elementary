package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To1And5Then5() {
        int a = 3;
        int b = 1;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To3And5And6Then6() {
        int a = 3;
        int b = 3;
        int c = 5;
        int d = 6;
        int result = Max.max(a, b, c, d);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}