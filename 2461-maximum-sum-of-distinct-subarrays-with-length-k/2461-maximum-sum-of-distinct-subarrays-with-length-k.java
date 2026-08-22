class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0,max=0;
        int dups=0;
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            map.put(nums[i],map.get(nums[i])+1);
            if (map.get(nums[i])>1){
                dups+=1;
            }
            sum=sum+nums[i];

        }
        if(dups==0){
             max=Math.max(max,sum);
        }
        for(int i=k;i<nums.length;i++){
            int numadd=nums[i],numremove=nums[i-k];
            if(!map.containsKey(numadd)){
                map.put(numadd,0);
            }
            map.put(numadd,map.get(numadd)+1);
            if (map.get(numadd)>1){
                dups+=1;
            }
            sum=sum+numadd;
            if (map.get(numremove)>1){
                dups-=1;
            }
            map.put(numremove,map.get(numremove)-1);
            sum=sum-numremove;
            if(dups==0){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}