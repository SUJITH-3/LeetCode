
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.
Example 1:
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
Example 3:

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 


 class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        if(nums.length==1)
        return nums[0];
        if(nums[start]<nums[end]) 
        return nums[0];
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[mid+1]) return nums[mid+1];
            if(nums[mid]<nums[mid-1]) return nums[mid];
            if(nums[start]<nums[mid]){
                //left is sorted call on right as smallest will be there only
                start=mid+1;
            }
            else{
                //right is sorted call on left as smallest will be there only
                end=mid-1;
            }
        }
        return 1;
    }
}




class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        if(nums.length==2)
        {
            if(nums[1]<nums[0])
            {
                return nums[1];
            }
        }
        if(nums.length==1)
        return nums[0];
        while(l<=r)
        {
            mid=(l+r)/2;
            if(nums[mid]>nums[mid+1])
            {
                return nums[mid+1];
            }
       
            else if(nums[l]<nums[r])
            {
                return nums[l];
            }
                 else if(nums[mid]<nums[mid-1])
            {
                return nums[mid];
            }
            else if(nums[l]<nums[mid])
            {
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return nums[mid];
    }
}
