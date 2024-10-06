class Solution {
    public int n, m;

    // Directions to move in 8 directions
    public ArrayList<ArrayList<Integer>> dir = new ArrayList<>(
        Arrays.asList(
            new ArrayList<>(Arrays.asList(-1, -1)),
            new ArrayList<>(Arrays.asList(-1, 0)),
            new ArrayList<>(Arrays.asList(-1, 1)),
            new ArrayList<>(Arrays.asList(0, -1)),
            new ArrayList<>(Arrays.asList(0, 1)),
            new ArrayList<>(Arrays.asList(1, -1)),
            new ArrayList<>(Arrays.asList(1, 0)),
            new ArrayList<>(Arrays.asList(1, 1))
        )
    );

    // Iterative DFS using a stack to mark visited parts of an island
    public void solve(char[][] grid, int i, int j) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});

        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            int x = curr[0], y = curr[1];

            // Boundary and visited checks
            if (x < 0 || y < 0 || x >= n || y >= m || grid[x][y] == '0') continue;

            // Mark the current cell as visited
            grid[x][y] = '0';

            // Traverse in all 8 possible directions
            for (int k = 0; k < dir.size(); k++) {
                int newi = x + dir.get(k).get(0);
                int newj = y + dir.get(k).get(1);
                stack.push(new int[]{newi, newj});
            }
        }
    }

    // Main function to count islands
    public int numIslands(char[][] grid) {
        // Initialize n (rows) and m (columns)
        n = grid.length;
        m = grid[0].length;

        int count = 0; // Island count

        // Traverse the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') { // If land is found
                    solve(grid, i, j); // Call DFS to mark the island
                    count++; // Increment the island count
                }
            }
        }
        return count; // Return the total number of islands
    }
}