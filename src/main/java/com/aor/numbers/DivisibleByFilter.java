package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{

    private int i;

    public DivisibleByFilter(int i) {
        this.i = i;
    }
    @Override
    public boolean accept(Integer number) {
        if (number % i == 0) return true;
        return false;
    }
}
