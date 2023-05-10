class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum=0,temp=x;
        while(temp!=0){
        
        sum=sum*10+ temp%10;
        temp=temp/10;
        }
        
        
        return x==sum;
    }
}
