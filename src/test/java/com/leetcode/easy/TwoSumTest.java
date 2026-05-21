package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoSumTest {

    private TwoSum solution;

    @BeforeEach
    void setUp() {
        solution = new TwoSum();
    }

    @Test
    void testExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testExample2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testExample3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{2, 4}, result);
    }

    @Test
    void testMixedNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void testBruteForceExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSumBruteForce(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testHashMapTwoPassExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSumHashMapTwoPass(nums, target);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}
