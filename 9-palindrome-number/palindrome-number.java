class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s=Integer.toString(x);
        int i=0;
        int n=s.length()-1;
        while(i<=n){
            if(s.charAt(i)!=s.charAt(n)){
                return false;
            }
        
            else{
                i++;
                n--;
            }
        }
        return true;
    }
}