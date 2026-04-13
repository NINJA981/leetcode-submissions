# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
            
        final = []
        queue = collections.deque([root])
        
        # NEW: Keep track of the floor we are on!
        floor_number = 0 
        
        while queue:
            ll = len(queue)
            current = []
            
            for i in range(ll):
                node = queue.popleft()
                current.append(node.val)
                
                if node.left: queue.append(node.left)
                if node.right: queue.append(node.right)
            
 
            
            if floor_number%2!=0:
                current.reverse() 
                
            final.append(current)
            floor_number += 1
            
        return final

        