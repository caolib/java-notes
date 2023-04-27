package Algorithm.src.test.java.Algorithm.src.排序算法;

import Algorithm.src.排序算法.InsertSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertSortTest {

    @Test
    @DisplayName("Should return the same array when the input array has only one element")
    void insertSortWhenArrayHasOneElement() {
        int[] arr = {5};
        int[] expected = {5};
        int[] result = InsertSort.insertSort(arr);

        assertArrayEquals(
                expected, result, "The sorted array should be the same as the input array");
    }

    @Test
    @DisplayName("Should return a sorted array when the input array contains negative numbers")
    void insertSortWhenArrayContainsNegativeNumbers() {
        int[] inputArray = {5, 4, -1, 6, -5, 10};
        int[] expectedArray = {-5, -1, 4, 5, 6, 10};

        int[] resultArray = InsertSort.insertSort(inputArray);

        assertArrayEquals(expectedArray, resultArray, "The sorted array is not as expected");
    }

    @Test
    @DisplayName("Should return a sorted array when the input array contains duplicate numbers")
    void insertSortWhenArrayContainsDuplicateNumbers() {
        int[] inputArray = {5, 4, -1, 6, -5, 10, 4, 6};
        int[] expectedArray = {-5, -1, 4, 4, 5, 6, 6, 10};

        int[] resultArray = InsertSort.insertSort(inputArray);

        assertArrayEquals(expectedArray, resultArray, "The sorted array is not as expected");
    }

    @Test
    @DisplayName("Should return a sorted array when the input array is unsorted")
    void insertSortWhenArrayIsUnsorted() {
        int[] inputArray = {5, 4, -1, 6, -5, 10};
        int[] expectedArray = {-5, -1, 4, 5, 6, 10};

        int[] resultArray = InsertSort.insertSort(inputArray);

        assertArrayEquals(expectedArray, resultArray, "The sorted array is not as expected");
    }

    @Test
    @DisplayName("Should return the same array when the input array is already sorted")
    void insertSortWhenArrayIsAlreadySorted() {
        int[] inputArray = {-5, -1, 4, 5, 6, 10};
        int[] expectedArray = {-5, -1, 4, 5, 6, 10};

        int[] resultArray = InsertSort.insertSort(inputArray);

        assertArrayEquals(
                expectedArray,
                resultArray,
                "The sorted array should be the same as the input array");
    }
}