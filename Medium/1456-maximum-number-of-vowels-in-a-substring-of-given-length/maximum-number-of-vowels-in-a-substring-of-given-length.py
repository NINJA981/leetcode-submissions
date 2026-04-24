class Solution:
    def maxVowels(self, s: str, k: int) -> int:

        count=0

        for i in range(k):

            if s[i] in 'aeiou':
                count+=1
            
        left = 0 
        right = k - 1 
        highest = count

        while right < len(s) - 1:
            
            

            if s[left] in 'aeiou':
                count -= 1 

            if s[right+1] in 'aeiou':
                count+=1
            if count > highest : 
                highest = count
                
            left+=1
            right +=1
        return highest
                


        