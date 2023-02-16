package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int result = Factorial.calc(in);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int result = Factorial.calc(in);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}