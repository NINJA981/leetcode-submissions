class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        i=0
        j=0
        while i<=len(nums)-1:
            if nums[i]!=0:
                nums[j]=nums[i]
                j+=1
            i+=1
        while j<=len(nums)-1:
            nums[j]=0
            j+=1

            
        