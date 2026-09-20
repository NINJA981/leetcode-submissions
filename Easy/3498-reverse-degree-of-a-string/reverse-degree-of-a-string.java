class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int count = 1;
        for(char ch : s.toCharArray()){
            
            sum+=('z' - ch + 1 )* count;
            count ++;
        }
        return sum;
        
    }
}