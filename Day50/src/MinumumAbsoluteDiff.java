import java.util.Arrays;
import java.util.TreeSet;

public class MinumumAbsoluteDiff {

        public int[][] minAbsDiff(int[][] grid, int k) {
            int m = grid.length;
            int n = grid[0].length;

            int row = m - k + 1;
            int col = n - k + 1;

            int[][] ans = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    TreeSet<Integer> set = new TreeSet<>();

                    for (int r = i; r < i + k; r++) {
                        for (int c = j; c < j + k; c++) {
                            set.add(grid[r][c]);
                        }
                    }

                    if (set.size() <= 1) {
                        ans[i][j] = 0;
                        continue;
                    }

                    int prev = 0;
                    boolean first = true;
                    int minDiff = Integer.MAX_VALUE;

                    for (int val : set) {
                        if (first) {
                            prev = val;
                            first = false;
                        } else {
                            minDiff = Math.min(minDiff, val - prev);
                            prev = val;
                        }
                    }

                    ans[i][j] = minDiff;
                }
            }

            return ans;
        }
    public static void main(String[] args) {
        MinumumAbsoluteDiff sol = new MinumumAbsoluteDiff();

        int[][] grid = {
                {1, -2, 3},
                {2, 3, 5}
        };
        int k = 2;

        int[][] result = sol.minAbsDiff(grid, k);

        System.out.println("Output:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
    }

