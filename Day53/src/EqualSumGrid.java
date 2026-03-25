public class EqualSumGrid {

        public boolean canPartitionGrid(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            long total = 0;
            long[] rowSum = new long[m];
            long[] colSum = new long[n];

            // Compute total, row sums, and column sums
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int val = grid[i][j];
                    total += val;
                    rowSum[i] += val;
                    colSum[j] += val;
                }
            }

            // If total sum is odd, equal partition is impossible
            if (total % 2 != 0) return false;

            long target = total / 2;

            // Check horizontal cuts
            long prefix = 0;
            for (int i = 0; i < m - 1; i++) {
                prefix += rowSum[i];
                if (prefix == target) return true;
            }

            // Check vertical cuts
            prefix = 0;
            for (int j = 0; j < n - 1; j++) {
                prefix += colSum[j];
                if (prefix == target) return true;
            }

            return false;
        }
    }
