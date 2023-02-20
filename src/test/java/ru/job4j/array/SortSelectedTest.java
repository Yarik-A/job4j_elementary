package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort5Numbers() {
        int[] data = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = {0, 8, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = {0, 3, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort6Numbers() {
        int[] data = {10, 1, 5, 2, 3, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 5, 6, 10};
        assertThat(result).containsExactly(expected);
    }
}