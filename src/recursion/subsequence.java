package recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequence {
	public static void generateSubsequences(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include the current element in the subsequence
        current.add(arr[index]);
        generateSubsequences(arr, index + 1, current, result);

        // Exclude the current element from the subsequence
        current.remove(current.size() - 1);
        generateSubsequences(arr, index + 1, current, result);
    }

    public static void printSubsequences(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsequences(arr, 0, new ArrayList<>(), result);

        for (List<Integer> subsequence : result) {
            System.out.println(subsequence);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Subsequences of the array:");
        printSubsequences(arr);
    }
}
