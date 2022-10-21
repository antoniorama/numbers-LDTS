package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.code.Stub;
import sun.net.www.content.text.Generic;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    private List<Integer> list;

    @BeforeEach
    public void create_list() {
        list = Arrays.asList(1,2,4,2,5);
    }

    @Test
    public void deduplicate() {

        class StubListSorter implements GenericListSorter {
            @Override
            public List<Integer> sort(List<Integer> list) {
                return Arrays.asList(1,2,4,5);
            }
        }

        StubListSorter sorter = new StubListSorter();
        List<Integer> expected = sorter.sort(list);
        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }

    @Test
    public void deduplicateBug8726() {

        class StubListSorter implements GenericListSorter {
            @Override
            public List<Integer> sort(List<Integer> list) {
                return Arrays.asList(1, 2, 4);
            }
        }

        StubListSorter sorter = new StubListSorter();
        List<Integer> expected = sorter.sort(list);
        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }
}
