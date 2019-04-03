package com.anupam.services;

import java.util.function.Function;

public class SquareFunction implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer * integer;
    }
}
