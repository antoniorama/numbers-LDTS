package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {

    @Test
    public void oneIsPositive() {
        PositiveFilter filter = new PositiveFilter();
        Assertions.assertTrue(filter.accept(1));
    }

    @Test
    public void maxIntIsPositive() {
        PositiveFilter filter = new PositiveFilter();
        Assertions.assertTrue(filter.accept(Integer.MAX_VALUE));
    }

    @Test
    public void zeroIsNotPositive() {
        PositiveFilter filter = new PositiveFilter();
        Assertions.assertFalse(filter.accept(0));
    }

    @Test
    public void minusTenIsNotPositive() {
        PositiveFilter filter = new PositiveFilter();
        Assertions.assertFalse(filter.accept(-10));
    }
}
