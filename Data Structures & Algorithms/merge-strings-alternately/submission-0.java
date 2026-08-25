class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1=0;
        int p2=0;
        String output= "";

        while ( p1<word1.length() && p2<word2.length()){
            output +=word1.charAt(p1);
            output +=word2.charAt(p2);
            p1++;
            p2++;
        }

        output +=word2.substring(p2);
        output +=word1.substring(p1);

        return output;
        
    }
}