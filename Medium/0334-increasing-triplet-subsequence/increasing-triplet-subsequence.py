class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        i=j=k=float(inf)
        for num in nums:

            if num<=i: 
                i=num
            elif num>=i and num<=j:
                j=num
            elif num>=j:
                k=num
                return True
        return False
            

        