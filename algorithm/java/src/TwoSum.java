import org.junit.Assert;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.
 *
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n^2) time complexity?
 *
 * @author starkyanng
 * @date 2022/03/19
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums0 = new int[]{2,7,11,15};
        int target0 = 9;
        int[] res0 = twoSum(nums0, target0);
        Assert.assertEquals(0, res0[0]);
        Assert.assertEquals(1, res0[1]);

        int[] nums1 = new int[]{3,2,4};
        int target1 = 6;
        int[] res1 = twoSum(nums1, target1);
        Assert.assertEquals(1, res1[0]);
        Assert.assertEquals(2, res1[1]);

        int[] nums2 = new int[]{3,3};
        int target2 = 6;
        int[] res2 = twoSum(nums2, target2);
        Assert.assertEquals(0, res2[0]);
        Assert.assertEquals(1, res2[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (null == nums || nums.length < 2) {
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
