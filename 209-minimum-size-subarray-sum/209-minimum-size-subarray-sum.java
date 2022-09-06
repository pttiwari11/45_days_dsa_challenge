class Solution {
    public int minSubArrayLen(int s, int[] a) {
        if (a == null || a.length == 0)
            return 0;
  
        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
  
        while (j < a.length) {
            sum += a[j++];
    
            while (sum >= s) {
                min = Math.min(min, j - i);
                sum -= a[i++];
            }
        }
  
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}


/*
    int minLen = Integer.MAX_VALUE;
        int currSum;
        int currLen;
        for (int i=0; i<nums.length; i++) {
            currSum = 0;
            currLen = 0;
            if (nums[i] != target) {
                for (int j=i; j<nums.length; j++) {
                    currSum += nums[j];
                    currLen++;
                    if(currSum >= target) {
                        if(currLen < minLen) {
                            minLen = currLen;
                        }
                        //System.out.println(i);
                        
                    }
                }
            } else {
                return 1;
            }
            
        }
        return minLen != Integer.MAX_VALUE ? minLen : 0;



*/