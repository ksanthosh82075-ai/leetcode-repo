# Last updated: 8/14/2026, 2:33:29 PM
class Solution:
    def mctFromLeafValues(self, arr: List[int]) -> int:
        stack = [float('inf')]
        res = 0
        for i in arr:
            while stack and stack[-1]<=i:
                cur = stack.pop()
                if stack:
                    res += cur * min(stack[-1],i)
            stack.append(i)
        while len(stack)>2:
            res += stack.pop() * stack[-1]
        return res