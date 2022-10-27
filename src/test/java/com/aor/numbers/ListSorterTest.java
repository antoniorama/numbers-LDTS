package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {

    private List<Integer> list;

    @BeforeEach
    public void create_list() {
        list = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
    }

    @Test
    public void sort() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(expected, sorted);
    }

    @Test
    public void sort2() {
        List<Integer> expected = Arrays.asList(-3, 0, 1, 2, 2);
        List<Integer> test_list = Arrays.asList(1, 2, 2, -3, 0);

        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(test_list);

        Assertions.assertEquals(expected, sorted);
    }
}
