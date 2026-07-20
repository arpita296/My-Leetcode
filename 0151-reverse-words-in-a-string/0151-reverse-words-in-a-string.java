class Solution {
    public String reverseWords(String s) {
        // s = "  hello  world  "
        //      i
        //                      j
        //hello world
        //now reverse and make
        //dlrow olleh
        // "world hello"
        int i=0,j=s.length()-1;
        while(i<s.length()){
            if(s.charAt(i)==' '){
                i=i+1;
            }else break;

        }
        while(j>0){
            if(s.charAt(j)==' '){
                j=j-1;
            }else break;
            
        }
        StringBuilder sb=new StringBuilder();
        while(i<=j){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
                i=i+1;

            }else if(s.charAt(i)==' '){
                if(sb.charAt(sb.length()-1)!=' '){
                    sb.append(s.charAt(i));
                    i=i+1; 
                }else{
                    i=i+1;
                }
            }else{
                i=i+1;
            }
        }
        // hello world
        int st=0,e=sb.length()-1;
        while (st<e){
            char temp=sb.charAt(st);
            sb.setCharAt(st,sb.charAt(e));
            sb.setCharAt(e,temp);
            st=st+1;
            e=e-1;
        }

            //dlrow olleh
            //now reverse
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
                r=r+1;
                m=m-1;
            }
            p=q+1;
            q=p;

                
        }
        return sb.toString();

    } 
        
}
