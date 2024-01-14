ou are given an m x n integer matrix matrix with the following two properties:
Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
  Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int start=0;
        int end=m*n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int row=mid/n;
            int col=mid%n;
            int middleEle=matrix[row][col];
            if(middleEle==target)
            {
                return true;
            }
            else if(middleEle<target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return false;
    }
}
