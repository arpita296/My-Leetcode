class Solution {
    public int sumOfDigits(int n){
        int sum=0;
        //first find the digits
       while(n>0){
        int dig=n%10;
        sum=sum+ (dig * dig);
        n=n/10;

       } 
       return sum;

    }
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        
        while(fast!=1){
            slow=sumOfDigits(slow);
            fast=sumOfDigits(sumOfDigits(fast));
            if(fast==1){
                return true;
            }
            if(slow==fast){
                return false;
            }
               
        }
        return true;
        
        
        
      
    }
}