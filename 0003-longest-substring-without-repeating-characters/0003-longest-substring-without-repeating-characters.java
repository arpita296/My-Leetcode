class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character>set=new HashSet<>();
        
        int max=0;
        for(int i=0;i<s.length();i++){
            Set<Character>set=new HashSet<>();
            int count=0;
            for(int j=i;j<s.length();j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                count+=1;
                max=Math.max(count,max);
            }
            
            
        }
        return max;
    }
}