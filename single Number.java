Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1

  class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hashMap=new HashMap<>();
        int ans=0;
        if(nums.length==1)
        return nums[0];
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                  hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
            }
        }
        System.out.print(hashMap);
        for(int ele:nums)
        {
            if(hashMap.get(ele)==1)
            {
              return ele;
            }

        }
        return -1;
    }
}
