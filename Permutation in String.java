Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2.
Example 1:
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:
Input: s1 = "ab", s2 = "eidboaoo"
Output: false

  class Solution {
    public boolean checkInclusion(String s1, String s2) {
         boolean flag= false;

        Map<Character , Integer> m1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            m1.put( ch , m1.getOrDefault( ch , 0 )+1  );
        }
        for (int i = 0; i <=s2.length()-s1.length(); i++) {
            Map<Character , Integer> m2 = new HashMap<>();
            for (int j = i; j < i+s1.length(); j++) {
                char ch = s2.charAt(j);
                m2.put( ch , m2.getOrDefault( ch , 0 )+1  );
            }
            if( m1.equals(m2) ) {
                flag=true;
                break;
            }
        }
        return flag ;
    }
}
