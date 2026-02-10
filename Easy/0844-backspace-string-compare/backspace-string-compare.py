class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        def process(string):
            stack = []
            for char in string:
                if char != '#':
                    stack.append(char)
                elif stack:  
                    stack.pop()
            return stack
        
        return process(s) == process(t)

