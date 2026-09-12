package assignment_problems;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Empty prefix
        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            currentSum += num;

            // Check if required previous prefix exists
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            // Store current prefix sum
            map.put(currentSum,
                    map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        int result = subarraySum(nums, k);

        System.out.println(result);
    }
}