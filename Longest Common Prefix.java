Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

  lass Solution {
    public String longestCommonPrefix(String[] strs) {
        int index=0;
        String result="";
        if(strs.length==1)
        {
            return strs[0];
        }
        while(true)
        {
            for(int i=0;i<strs.length-1;i++)
       {
           if(strs[i].length()<=index||strs[i+1].length()<=index||strs[i].charAt(index)!=strs[i+1].charAt(index))
           return result;
       }
       result=result+strs[0].charAt(index);
       index++;
        }
        
    }
}
