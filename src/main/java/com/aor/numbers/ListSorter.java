package com.aor.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An utility class to sort list of numbers.
 */
public class ListSorter {
    /**
     * Really stupid way to sort a list.
     * @return A sorted version of the list.
     */
    public List<Integer> sort(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
