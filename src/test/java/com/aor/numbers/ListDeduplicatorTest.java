package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    private List<Integer> list;

    @BeforeEach
    public void create_list() {
        list = Arrays.asList(1,2,4,2,5);
    }
    GenericListSorter sorter = Mockito.mock(GenericListSorter.class);

    @Test
    public void deduplicate() {
        List<Integer> expected = Arrays.asList(1,2,4,5);
        Mockito.when(sorter.sort(Mockito.anyList())).thenReturn(Arrays.asList(1,2,2,4,5));

        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> deduplicate = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, deduplicate);
    }

    @Test
    public void deduplicate_bug_8726() {
        List<Integer> expected = Arrays.asList(1,2,4);
        List<Integer> test_list = Arrays.asList(1,2,4,2);

        Mockito.when(sorter.sort(Mockito.anyList())).thenReturn(Arrays.asList(1,2,2,4));

        ListDeduplicator deduplicator = new ListDeduplicator(sorter);
        List<Integer> deduplicate = deduplicator.deduplicate(test_list);

        Assertions.assertEquals(expected, deduplicate);
    }


}
