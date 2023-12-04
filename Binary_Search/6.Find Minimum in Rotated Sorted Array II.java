// Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

// [4,5,6,7,0,1,4] if it was rotated 4 times.
// [0,1,4,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

// Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

// You must decrease the overall operation steps as much as possible.

 

// Example 1:

// Input: nums = [1,3,5]
// Output: 1
// Example 2:

// Input: nums = [2,2,2,0,1]
// Output: 0

class Solution {
    public int findMin(int[] nums) 
    {
        int low = 0;
        int high = nums.length-1;

        int num = Integer.MAX_VALUE;

        while( low <= high)
        {
            int mid = (low + high)/2;
            if(num > nums[mid])
                num = nums[mid];
            
            if(nums[mid] == nums[low] && nums[mid] == nums[high])
            {
                low++;
                high--;
            }

            else if(nums[low] <= nums[mid])
            {
                if(nums[low] < num) num = nums[low];

                low = mid+1;
            }

            else{
                high = mid-1;
            }
        }

        return num;
    }
}
