class Solution {
    public int getSum(int a, int b) {
        int sum = a^b;
        int carry = (a & b) << 1;
        while (carry!=0){
            sum   = a ^ b;
            carry = (a & b) << 1 ;
            a= sum ; 
            b= carry;
            

        }
        return sum;
    }
}