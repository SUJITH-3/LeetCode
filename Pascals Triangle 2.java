Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 

Constraints:

0 <= rowIndex <= 33
 

Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?

  class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>parent=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer>child=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    child.add(1);
                }
                else
                {
                    List<Integer>prev=parent.get(i-1);
                    child.add(prev.get(j)+prev.get(j-1));
                }
            }
            parent.add(child);
        }
        return parent.get(rowIndex);
    }
}
