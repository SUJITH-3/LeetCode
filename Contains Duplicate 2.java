Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false

  class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map <Integer,Integer> hashmap=new HashMap<>();
        int similar=0;
        int i,d;
        for( i=0;i<nums.length;i++)
        {
            if(!hashmap.containsKey(nums[i]))
          hashmap.put(nums[i],i);
          else{
             similar= hashmap.get(nums[i]);
              d=Math.abs(similar-i);
              if(d<=k)
              return true;
              else
              hashmap.put(nums[i],i);
          }
        }
        return false;
       
    }
}