package Algorithm.src.test.java.Algorithm.src.排序算法;

import Algorithm.src.排序算法.BubbleSortPro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortProTest {

    @Test
    @DisplayName("Should not change the array when the input array has only one element")
    void bubbleSortProWithSingleElementArray() {
        int[] arr = {5};
        int[] expected = {5};

        BubbleSortPro.bubbleSortPro(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Should not change the array when the input array is empty")
    void bubbleSortProWithEmptyArray() {
        int[] arr = new int[]{};
        int[] expected = new int[]{};

        BubbleSortPro.bubbleSortPro(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Should not change the array when the input array is already sorted")
    void bubbleSortProWithSortedArray() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};

        BubbleSortPro.bubbleSortPro(inputArray);

        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    @DisplayName("Should sort the array in ascending order when the input array is unsorted")
    void bubbleSortProWithUnsortedArray() {
        int[] inputArray = {5, 3, 8, 1, 6};
        int[] expectedArray = {1, 3, 5, 6, 8};

        BubbleSortPro.bubbleSortPro(inputArray);

        assertArrayEquals(
                expectedArray, inputArray, "The sorted array should be in ascending order");
    }

    @Test
    @DisplayName(
            "Should sort the array in ascending order when the input array has duplicate elements")
    void bubbleSortProWithDuplicateElements() {
        int[] inputArray = {5, 3, 8, 4, 2, 3, 1};
        int[] expectedArray = {1, 2, 3, 3, 4, 5, 8};

        BubbleSortPro.bubbleSortPro(inputArray);

        assertArrayEquals(
                expectedArray,
                inputArray,
                "The sorted array should be in ascending order with duplicate elements handled correctly");
    }
}