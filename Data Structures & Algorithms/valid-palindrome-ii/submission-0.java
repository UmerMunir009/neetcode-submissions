class Solution {
    public boolean validPalindrome(String s) {
        int p1=0;
        int p2=s.length()-1;

        while (p1<p2){
            if(s.charAt(p1)!=s.charAt(p2)){
                return isPalindrome(s,p1+1,p2) || isPalindrome(s,p1,p2-1);
            }
            p1++;
            p2--;
        }
        return true;
    }
    boolean isPalindrome(String str, int p1,int p2){
        while (p1<p2){
            if(str.charAt(p1)!=str.charAt(p2)){
               return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}