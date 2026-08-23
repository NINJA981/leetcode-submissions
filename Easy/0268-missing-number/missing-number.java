class Solution {
    public int missingNumber(int[] nums) {
        int result [] = new int[nums.length];
        
        Arrays.sort(nums);
        for ( int i = 0 ; i<nums.length ; i++){
            if( i != nums[i]){
                return i;

            }
        

        }
        return nums[nums.length-1]+1;

        
    }
}