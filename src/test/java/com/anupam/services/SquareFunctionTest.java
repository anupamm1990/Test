package com.anupam.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareFunctionTest {

    SquareFunction squareFunction;

    @Before
    public void setUp() {
        squareFunction = new SquareFunction();
    }

    @Test
    public void testSquareFunction() {
        Assert.assertTrue(squareFunction.apply(2).equals(4));
    }
}
