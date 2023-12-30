Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Example 1:
Input: s = "()"
Output: true
Example 2:
Input: s = "()[]{}"
Output: true
Example 3:
Input: s = "(]"
Output: false
class Solution {
    public boolean isValid(String s) {
       Stack <Character> stack=new Stack<>();
       for(int i=0;i<s.length();i++)
       {
           char input=s.charAt(i);
           if(input=='('||input=='{'||input=='[')
           {
               stack.push(input);
           }
           else{
               if(stack.isEmpty())
               {
                   return false;
               }
               if((stack.peek()=='('&&input==')')||(stack.peek()=='['&&input==']')||
               (stack.peek()=='{'&&input=='}'))
               {
                   stack.pop();
               }
               else{
                   return false;
               }
           }}
           return stack.isEmpty();
               
    }
}
