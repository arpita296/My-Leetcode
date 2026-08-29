class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        //using Rabin-Karp Algorithm
        int k=10;
        int rep=0;
        Set <Integer> seen=new HashSet<>();
        Set <String> result=new HashSet<>();
        Map<Character,Integer>map=new HashMap<>();
        map.put('A',0);
        map.put('C',1);
        map.put('G',2);
        map.put('T',3);
        //0123456789
        //AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
        //9876543210
        //
        if(s.length()<=k){
            return new ArrayList<>();
        }
        for(int i=0;i<k;i++){
            rep=rep+((int) Math.pow(4,k-i-1)*map.get(s.charAt(i)));
        }
        seen.add(rep);
        for(int i=k;i<s.length();i++){
            rep=rep-((int) Math.pow(4,(k-1))*map.get(s.charAt(i-k)));
            rep=rep*4;
            rep=rep+map.get(s.charAt(i));
            if(seen.contains(rep)){
                result.add(s.substring(i-k+1,i+1));
                
            }
            seen.add(rep);
            
        }
        return new ArrayList<>(result);
    }
}
