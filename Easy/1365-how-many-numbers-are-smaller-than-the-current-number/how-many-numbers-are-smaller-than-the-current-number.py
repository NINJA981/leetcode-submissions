class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        a=sorted(nums)
        rank={}
        for i,num in enumerate(a):
            if num not in rank:
                rank[num]=i
        return [ rank[i] for i in nums]