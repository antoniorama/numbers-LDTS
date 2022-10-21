package com.aor.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * An utility class to sort list of numbers.
 */
public class ListSorter implements GenericListSorter{
    /**
     * Really stupid way to sort a list.
     * @return A sorted version of the list.
     */
    public List<Integer> sort(List<Integer> list) {
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        return sortedList;
    }
}
