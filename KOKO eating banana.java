class Solution {
    int maxElement(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }
    int hourCalc(int mid,int arr1[])
    {
        double b=0;
        for(int i=0;i<arr1.length;i++)
        {
          b=b+Math.ceil((double)arr1[i]/(double)mid);
        }
        return (int)b;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=maxElement(piles);
        while(l <= r)
        {
          
            int mid= (l + r) /2;
            int totalhr=hourCalc(mid,piles);
            if(totalhr<=h)
            {
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
       return l;
    }
   
}
