class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer >set=new HashSet<>();
        if(k==0){
            return false;
        }
        for(int i=0;i<Math.min(k,nums.length);i++){
            
            if(set.contains(nums[i])){
                return true;

                
            }
            set.add(nums[i]);
            
            
        }
        for(int i=k;i<nums.length;i++){
           
            
            if(set.contains(nums[i])){
                return true;

                
            }
            set.remove(nums[i-k]);
            set.add(nums[i]);
        }
        return false;
    }
}