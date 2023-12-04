// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

 

// Example 1:


// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
// Output: true
// Example 2:


// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
// Output: false

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int low = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int high = n*m-1;

        while( low <= high )
        {
            int mid = low + (high - low)/2;

            int i = mid / m;
            int j = mid % m;

            if( matrix[i][j] == target)
                return true;
            else if( matrix[i][j] > target)
                high = mid-1;
            else
                low = mid+1;
        }    

        return false;
    }
}
