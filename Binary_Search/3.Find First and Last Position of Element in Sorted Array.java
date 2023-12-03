// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]

class Solution {
    public static int lastPos(int n, int key, int[] v) {
    int start = 0;
    int end = n - 1;
    int res = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (v[mid] == key) {
        res = mid;
        start = mid + 1;

      } else if (key < v[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return res;
  }
  public static int firstPos(int n, int key, int[] v) {
    int start = 0;
    int end = n - 1;
    int res = -1;

    while (start <= end) {
      int mid = (start + end) / 2;
      if (v[mid] == key) {
        res = mid;
        end = mid - 1;

      } else if (key < v[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return res;
  }
    public int[] searchRange(int[] nums, int target) 
    {
        int[] ans = new int[2];
        ans[0] = firstPos(nums.length,target,nums);
        ans[1] = lastPos(nums.length,target,nums);
        return ans;
    }
}
