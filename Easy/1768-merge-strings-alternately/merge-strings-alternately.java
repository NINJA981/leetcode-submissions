class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size = word1.length() + word2.length();
        char[] result =new char[size];
        int p1 = 0 ;
        int p2 = 0 ; 

        for (int i=0;i<size; ){
            if  ( p1< word1.length()){
                result[i]=word1.charAt(p1);
                p1++;
                i++;
            }
            if  ( p2< word2.length()){
                result[i]= word2.charAt(p2);
                p2++;
                i++;
            }
        }
    return new String(result);
    }
}