public class ConstructProduct {


        public int[][] constructProductMatrix(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int size = n * m;
            int MOD = 12345;

            long[] prefix = new long[size];
            long[] suffix = new long[size];

            prefix[0] = 1;
            for (int k = 1; k < size; k++) {
                int prevVal = grid[(k - 1) / m][(k - 1) % m];
                prefix[k] = (prefix[k - 1] * prevVal) % MOD;
            }

            suffix[size - 1] = 1;
            for (int k = size - 2; k >= 0; k--) {
                int nextVal = grid[(k + 1) / m][(k + 1) % m];
                suffix[k] = (suffix[k + 1] * nextVal) % MOD;
            }

            int[][] ans = new int[n][m];
            for (int k = 0; k < size; k++) {
                ans[k / m][k % m] = (int)((prefix[k] * suffix[k]) % MOD);
            }

            return ans;
        }

    }
