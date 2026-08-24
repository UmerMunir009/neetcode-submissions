class Solution {
    public boolean isPalindrome(String s) {

        String newStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int p1=0;
        int p2=newStr.length()-1;

        while (p1<p2){
            if(newStr.charAt(p1)!=newStr.charAt(p2)){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
        
    }
}
