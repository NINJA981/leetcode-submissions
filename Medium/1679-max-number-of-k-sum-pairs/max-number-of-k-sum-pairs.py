class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        a=nums.sort()
        p1=0
        p2=len(nums)-1
        count=0
        while p1<p2:
            sum=nums[p1]+nums[p2]
            if k==sum:
                count+=1
                p1+=1
                p2-=1
            if sum>k:
                p2-=1
            if sum<k:
                p1+=1
        return count

        