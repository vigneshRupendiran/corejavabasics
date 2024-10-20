import java.util.HashMap;

public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        // Map to store the number and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, store the number with its index
            map.put(nums[i], i);
        }

        // Since the problem guarantees a solution, this line will never be reached
        throw new IllegalArgumentException("No two sum solution");
    }

    // Main method for testing
    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();

        int[] nums = {11, 20, 12, 8,5,2,7,3,1};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

