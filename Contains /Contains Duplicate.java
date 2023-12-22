Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
  
Example 1:
Input: nums = [1,2,3,1]
Output: true
  
Example 2:
Input: nums = [1,2,3,4]
Output: false

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                if(nums[i]==nums[j+1])
                    return true;
            }
         
        }
        return false;  
    }
}
