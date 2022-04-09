package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMa1To1Then1() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMa1To2To3Then3() {
        int left = 1;
        int middle = 2;
        int right = 3;
        int result = Max.max(left, right, middle);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMa8To2To4To9Then1() {
        int left = 8;
        int middle = 2;
        int right = 4;
        int fourth = 9;
        int result = Max.max(left, right, middle, fourth);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}