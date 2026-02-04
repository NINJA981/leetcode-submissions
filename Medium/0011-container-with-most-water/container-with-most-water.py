class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        left=0
        maxi=0
        right=len(height)-1
        while left<right:
            if height[left]>height[right]:
                val=(right-left)*min(height[left],height[right])
                right-=1
            else:
                val=(right-left)*min(height[left],height[right])
                left+=1
            if val>maxi:
                maxi=val
        return maxi