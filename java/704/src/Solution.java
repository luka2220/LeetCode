public class Solution {
    public static void main(String[] args) {
        // Input: nums = [-1,0,3,5,9,12], target = 9
        // Output: 4
        int[] t1 = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(t1, 9));
    }

    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = Math.floorDiv(left + right, 2);

            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}