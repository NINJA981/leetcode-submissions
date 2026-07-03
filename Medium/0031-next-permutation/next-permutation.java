class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for( int i=nums.length - 2 ; i>=0 ; i-- ){
            if (nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if (pivot == -1){
            reverse(nums,0);
            return;
        }
        else{
           for (int i = nums.length - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    int temp = nums[i];
                    nums[i]=nums[pivot];
                    nums[pivot] = temp;
                    break;
                


        }
    }
    reverse(nums,pivot+1);
        }}

        
    private void reverse(int[] nums,int start){
        int left = start;
        int right = nums.length - 1; 
        int temp = 0;
        while(left<right){
            temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
            
        }
    
        
    }
}