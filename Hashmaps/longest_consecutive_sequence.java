package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class longest_consecutive_sequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        // Create a HashMap to track whether each element is visited
        Map<Integer, Boolean> visitedElements = new HashMap<>();
        // Create a HashMap to map elements to their indices in the array
        Map<Integer, Integer> elementToIndexMapping = new HashMap();

        // Initialize the maps and mark all elements as unvisited
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            elementToIndexMapping.put(num, i);

            // Initialize visitedElements with false for each element
            if (!visitedElements.containsKey(num)) {
                visitedElements.put(num, false);
            }
        }

        ArrayList<Integer> longestSequence = new ArrayList<>();

        int globalMaxSequenceLength = 1;
        int globalMinStartIndex = 0;

        // Iterate through the input array to find the longest consecutive sequence
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            int currentMinStartIndex = i;

            int count = 0;
            int tempNum = num;

            // Check for consecutive elements in increasing order (forward)
            while (visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)) {
                visitedElements.put(tempNum, true); // Mark visited elements as true
                count++;
                tempNum++;
            }

            // Check for consecutive elements in decreasing order (backward)
            tempNum = num - 1;
            while (visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)) {
                visitedElements.put(tempNum, true); // Mark visited elements as true
                count++;

                currentMinStartIndex = elementToIndexMapping.get(tempNum);
                tempNum--;
            }

            // Update the global maximum sequence length and the starting index
            if (count > globalMaxSequenceLength) {
                globalMaxSequenceLength = count;
                globalMinStartIndex = currentMinStartIndex;
            } else if (count == globalMaxSequenceLength) {
                // If sequences have the same length, choose the one with the earlier starting element
                if (currentMinStartIndex < globalMinStartIndex) {
                    globalMinStartIndex = currentMinStartIndex;
                }
            }
        }

        int globalStartNum = arr[globalMinStartIndex];

        longestSequence.add(globalStartNum);

        // Add the ending element if the sequence length is greater than 1
        if (globalMaxSequenceLength > 1) {
            longestSequence.add(globalStartNum + globalMaxSequenceLength - 1);
        }

        return longestSequence;
    }
}
