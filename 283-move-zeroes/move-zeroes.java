class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0 ;
        int j = 0 ; 
        while (i < nums.length){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j+=1;
            }
            i+=1;
        }
        while ( j< nums.length){
            nums[j] = 0;
            j+=1;
        }
        

    }
}

