package java基础.src.操作系统算法.磁盘调度算法;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 /**
 * SCAN class implements the SCAN disk scheduling algorithm
 */
public class SCAN {
    public static void main(String[] args) {
        // Set the start position of the disk head
        int start = 100;
        // Create an ArrayList of requests
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(55, 58, 39, 18, 90, 160, 150, 38, 184));
        // Add the start position to the list of requests
        arr.add(start);
        // Print the results of the SCAN algorithm
        printSCAN(arr, start);
         // Set the start position of the disk head
        int start2 = 143;
        // Create an ArrayList of requests
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(86, 147, 91, 177, 94, 150, 102, 175, 130));
        // Add the start position to the list of requests
        arr2.add(start2);
        // Print the results of the SCAN algorithm
        printSCAN(arr2, start2);
    }
     /**
     * runSCAN() calculates the total seek time for the SCAN algorithm
     * @param arr The list of requests
     * @param start The starting position of the disk head
     * @return The total seek time
     */
    public static int runSCAN(ArrayList<Integer> arr, int start) {
        // Sort the list of requests
        Collections.sort(arr);
        // Initialize the total seek time
        int sum = 0;
        // Find the index of the start position in the list of requests
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == start) {
                index = i;
            }
        }
        // Store the index of the start position
        int index2 = index;
        // Calculate the total seek time from the start position to the end of the list
        for (int j = index + 1; j < arr.size(); j++) {
            sum += arr.get(j) - arr.get(index);
            index++;
        }
        // Calculate the total seek time from the start of the list to the start position
        for (int i = index2 - 1; i >= 0; i--) {
            sum += arr.get(index) - arr.get(i);
            index = i;
        }
        // Return the total seek time
        return sum;
    }
     /**
     * printSCAN() prints the results of the SCAN algorithm
     * @param arr The list of requests
     * @param start The starting position of the disk head
     */
    public static void printSCAN(ArrayList<Integer> arr, int start) {
        // Calculate the total seek time
        int len = runSCAN(arr, start);
        // Print the total seek time and average seek time
        System.out.println("\n寻道总长度：" + len);
        System.out.println("平均寻道长度：" + len * 1.0 / (arr.size() - 1) + "\n");
    }
}