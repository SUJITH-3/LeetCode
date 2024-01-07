Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321
Example 2:
Input: x = -123
Output: -321
Example 3:
Input: x = 120
Output: 21

  class Solution {
    public int reverse(int x) {
        long rem=0;
        int a;
        boolean sign=true;
        if(x<0)
        sign=false;
        x=Math.abs(x);
        while(x>0)
        {
            a=x%10;
            rem=rem*10+a;
            x=x/10;
        }
        System.out.print(x);
        if(rem<Integer.MIN_VALUE||rem>Integer.MAX_VALUE)
        return 0;
        if(!sign)
        return (int)(-1*rem);
    
        return (int)rem;

    }
}
