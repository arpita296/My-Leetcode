class Solution {
    public String reverseWords(String s) {
        int i=0,j=s.length()-1;
        StringBuilder sb=new StringBuilder();
        //append the characters iinto sb
        while(i<=j){

            sb.append(s.charAt(i));
            i++;
            

        }
        int p=0,q=0;
        while(p<sb.length()){
            while(q<sb.length() && sb.charAt(q)!=' '){
                q=q+1;
            }
            int r=p,m=q-1;
            while(r<m){
                char temp=sb.charAt(r);
                sb.setCharAt(r,sb.charAt(m));
                sb.setCharAt(m,temp);
                r++;
                m--;
            }
            p=q+1;q=p;
        }
        return sb.toString();
    }
}