class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        
        if not s:
            return True
        
        
        p2 = 0
        target_len = len(s)
        
        
        for char in t:
            if char == s[p2]:
                p2 += 1
                
                
                if p2 == target_len:
                    return True
        
        
        return False
        

    
        