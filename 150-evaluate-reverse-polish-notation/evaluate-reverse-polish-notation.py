class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack=[]
        ops={"+":operator.add,"-":operator.sub,"*":operator.mul,"/": lambda a, b: int(a / b)}
        for i in tokens:
            if i not in "+-/*":
                stack.append(int(i))
            else:
                a=stack.pop()
                b=stack.pop()
                result=ops[i](b,a)
                stack.append(result)
        return stack[0]