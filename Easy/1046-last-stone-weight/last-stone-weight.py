class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        if len(stones)==1:
            return stones[0]
        stones = [-s for s in stones]
        heapq.heapify(stones)
        while len(stones)>1:
            x=heapq.heappop(stones)
            y=heapq.heappop(stones)
            z=abs(x-y)
            if z!=0 :
                heapq.heappush(stones,-z)
        return abs(stones[0]) if len(stones)>0 else 0