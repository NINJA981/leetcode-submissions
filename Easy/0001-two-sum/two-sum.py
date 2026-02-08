class Solution(object):
    def twoSum(self, nums, target):
        hashmap={}
        for i,n  in enumerate(nums):
            remainder = target - n
            if remainder in hashmap:
                return [hashmap[remainder],i]
            hashmap[nums[i]]=i
                
        return []

        