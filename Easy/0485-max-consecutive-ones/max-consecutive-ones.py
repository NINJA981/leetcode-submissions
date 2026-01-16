class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxi = current = 0
        for i in nums:
            if i:
                current += 1
                if current > maxi: maxi = current
            else:
                current = 0
        return maxi