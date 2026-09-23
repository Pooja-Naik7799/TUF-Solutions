import java.util.*;

class Solution {
    //Function to find leaders in an array.
    public List<Integer> leaders(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // Iterate through each element in nums
        for (int i = 0; i < nums.length; i++) {
            boolean leader = true;

            /* Check whether nums[i] is greater
            than all elements to its right */
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] >= nums[i]) {
                    /* If any element to the right is greater 
                    or equal, nums[i] is not a leader */
                    leader = false;
                    break;
                }
            }

            // If nums[i] is a leader, add it to the ans list
            if (leader) {
                ans.add(nums[i]);
            }
        }

        // Return the leaders 
        return ans;
    }
}

class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};

        // Create an instance of the Solution class
        Solution finder = new Solution();

        // Get leaders using class method
        List<Integer> ans = finder.leaders(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : ans) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
}