class Solution:

    def findMaxAverage(self, nums: List[int], k: int) -> float:
        
        window=0
        for i in range(k):
            window+=nums[i]
        maxi=window
        left=1
        right=k
        while right<len(nums):
            window=window-nums[left-1]+nums[right]
            if window>maxi:
                maxi=window
            left+=1
            right+=1
        return maxi/k
        