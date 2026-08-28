class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int i =0,j=0;
        int sum=0;
        int max=Integer.MAX_VALUE;
        int count=0;
        int i=0;
        int n=nums.length;
        for(int j=0;j<n;j++){
            sum=sum+nums[j];
            while(sum>=target){
                max=Math.min(max,j-i+1);
                sum=sum-nums[i];
                i++;
                
            }
            
            
            
        }
        
        
        return max==Integer.MAX_VALUE?0:max;
    }
}