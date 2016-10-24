import java.io.*;

class MaxSubArray
{
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println(maxSubArray(new int[] {1,2,3,4,5,6}));
        System.out.println(maxSubArray(new int[] {-4,-3,-2,-1,0,1,2,3,4,5,6}));
        System.out.println(maxSubArray(new int[] {-4,-3,-2,-1}));
        System.out.println(maxSubArray(new int[] {-1,-2,-3,0}));
        
        System.out.println(maxSub(new int[] {1,2,3,4,5,6}));
        System.out.println(maxSub(new int[] {-4,-3,-2,-1,0,1,2,3,4,5,6}));
        System.out.println(maxSub(new int[] {-4,-3,-2,-1}));
        System.out.println(maxSub(new int[] {-1,-2,-3,0}));
    }
    
    public static int maxSubArray(int[] in) {
        
        int max;
        int curMax = max = in[0];
        
        for (int i = 0; i < in.length; i++) {
            curMax = Math.max(curMax+in[i], in[i]);
            max = Math.max(curMax, max);
        }
        
        return max;
    }
    
    public static int maxSub(int[] in) {        
        int maxSum;
        int minSum = maxSum = in[0];
        int sum = in[0];
        
        for (int i = 0; i < in.length; i++) {
            sum += in[i];
            if (minSum > sum) {
                minSum = sum;
            }
            if (sum - minSum > maxSum ) {
                maxSum = sum - minSum;          
            }
        }
        
        return maxSum;
    }
}
