class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        result=""
        for x in digits:
            result += str(x)
        ahah=int(result)+1
        
        
             
        abc=str(ahah)
        return [int(x) for x in abc]