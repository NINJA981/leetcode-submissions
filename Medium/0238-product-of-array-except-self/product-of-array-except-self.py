class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        n = len(nums)
        ans = [1] * n
        
        
        prefix_baton = 1
        for i in range(n):
            ans[i] = prefix_baton
            prefix_baton *= nums[i]
            
        
        suffix_baton = 1
        for i in range(n - 1, -1, -1):
            ans[i] *= suffix_baton
            suffix_baton *= nums[i]
            
        return ans



        
        