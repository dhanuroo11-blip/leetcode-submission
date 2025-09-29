import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[2];
        int n = nums.length;

       
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                result[0] = nums[i];
            }
        }

       
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
       
        result[1] = expectedSum - (actualSum - result[0]);

        return result;
    }
}
