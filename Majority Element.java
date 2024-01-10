The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

  class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Object values:map.values())
        {
            if((int)values>max)
            max=(int)values;
        }
         Set<Map.Entry<Integer,Integer>>entryset=map.entrySet();
         for(Map.Entry<Integer,Integer>entry:entryset)
         {
            if(entry.getValue().equals(max))
            {
                 a=(int) entry.getKey();
            }
         }
         return a;
           
    }
}
