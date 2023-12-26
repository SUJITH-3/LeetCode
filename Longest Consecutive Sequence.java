Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9


  class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>a=new HashSet<>();
        int max=0;
    for(int i=0;i<nums.length;i++)
    {
        a.add(nums[i]);
    }
    for(int i=0;i<nums.length;i++)
    {
        int num=nums[i];
        if(a.contains(num-1))
        continue;
        int currlen=0;
        while(a.contains(num))
        {
           currlen=currlen+1;
           num=num+1;
        }
        max=Math.max(currlen,max);
    }
    return max;

    }
}
