class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        new=[]
        heapq.heapify(new)
        for i in nums:
            heapq.heappush(new,i)
            if len(new)>k:
                heapq.heappop(new)
        return new[len(new)-k]
        
        