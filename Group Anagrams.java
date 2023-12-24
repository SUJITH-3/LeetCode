Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
  
Example 2:
Input: strs = [""]
Output: [[""]]
  
Example 3:
Input: strs = ["a"]
Output: [["a"]]

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> a=new HashMap<>();
        for(String original:strs)
        {
            char strArr[]=original.toCharArray();
            Arrays.sort(strArr);
            String sortedString=String.valueOf(strArr);
            if(!a.containsKey(sortedString))
            a.put(sortedString,new ArrayList<>());
            a.get(sortedString).add(original);
        }
        return new ArrayList<>(a.values());
    }
}
