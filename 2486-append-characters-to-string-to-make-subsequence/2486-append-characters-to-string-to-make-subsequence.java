class Solution {
    public int appendCharacters(String s, String t) {
      int i=0;
      int j=0;
      int sl=s.length();
      int tl=t.length();
      //using .length lesser make the problem more optimized
      while(i<sl && j<tl){
        if(s.charAt(i)==t.charAt(j)){
       
            j++;
        }
       
        i++;
    
      }
      //coaching
      //       i
      //coding=6
      //  j=2
      //t1=6 ans=6-2=4
      return tl-j;
    }
}