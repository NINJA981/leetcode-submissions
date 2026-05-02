class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        n = len(grid)
        # 1. Count the frequency of each column pattern
        col_counts = Counter(tuple(grid[i][j] for i in range(n)) for j in range(n))
        
        # 2. Sum up how many columns match each row
        total_matches = 0
        for row in grid:
            total_matches += col_counts[tuple(row)]
            
        return total_matches