# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        curr = root
        
        while curr:
            # 1. Both are greater? Go right.
            if p.val > curr.val and q.val > curr.val:
                curr = curr.right
                
            # 2. Both are smaller? Go left.
            elif p.val < curr.val and q.val < curr.val:
                curr = curr.left
                
            # 3. We found the split point (or a match)!
            else:
                return curr
                