Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
  
Example 2:
Input: nums = [1], k = 1
Output: [1]


  class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        List<Integer>li=new ArrayList<>(a.values());
        Collections.sort(li,Collections.reverseOrder());
        List<Integer>newli=new ArrayList<>(li.subList(0,k));
        int[] arr=new int[newli.size()];
        int j=0;
        for(var items:a.entrySet())
        {
            if(newli.contains(items.getValue()))
            arr[j++]=items.getKey();

        }
        return arr;
    }
 
}
