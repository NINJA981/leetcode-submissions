class Solution:
    def reverseVowels(self, s: str) -> str:
        left=0
        right=len(s)-1
        vow="aeiouAEIOU"
        s=list(s)

        while left<right:
            while left<right and s[left] not in vow:
                left+=1
            while left<right and s[right] not in vow:
                right-=1
            temp=s[right]
            s[right]=s[left]
            s[left]=temp
            left+=1 
            right-=1
        return "".join(s)

        