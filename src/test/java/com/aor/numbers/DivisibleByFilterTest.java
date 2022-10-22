package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest {

    @Test
    public void sixIsDivisibleByThree() {
        DivisibleByFilter filter = new DivisibleByFilter(3);
        Assertions.assertTrue(filter.accept(6));
    }

    @Test
    public void sixIsNotDivisibleByFour() {
        DivisibleByFilter filter = new DivisibleByFilter(4);
        Assertions.assertFalse(filter.accept(6));
    }
}
