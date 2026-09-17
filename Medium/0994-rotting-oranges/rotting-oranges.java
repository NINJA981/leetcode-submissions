class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        int count = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                }

                if (grid[r][c] == 1) {
                    count++;
                }
            }
        }

        return bfs(grid, queue, count);
    }

    public int bfs(int[][] grid, Queue<int[]> queue, int count) {
        int minutes = 0;

        while (!queue.isEmpty() && count > 0) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int r = cell[0];
                int c = cell[1];

                // down
                if (r + 1 < grid.length && grid[r + 1][c] == 1) {
                    grid[r + 1][c] = 2;
                    count--;
                    queue.offer(new int[]{r + 1, c});
                }

                // up
                if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                    grid[r - 1][c] = 2;
                    count--;
                    queue.offer(new int[]{r - 1, c});
                }

                // left
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    grid[r][c - 1] = 2;
                    count--;
                    queue.offer(new int[]{r, c - 1});
                }

                // right
                if (c + 1 < grid[0].length && grid[r][c + 1] == 1) {
                    grid[r][c + 1] = 2;
                    count--;
                    queue.offer(new int[]{r, c + 1});
                }
            }

            minutes++;
        }

        return count == 0 ? minutes : -1;
    }
}