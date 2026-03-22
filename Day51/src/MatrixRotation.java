public class MatrixRotation {

        public boolean findRotation(int[][] mat, int[][] target) {
            int n = mat.length;

            for (int k = 0; k < 4; k++) {
                if (isSame(mat, target, n)) {
                    return true;
                }
                mat = rotate(mat, n);
            }

            return false;
        }

        private boolean isSame(int[][] mat, int[][] target, int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] != target[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        private int[][] rotate(int[][] mat, int n) {
            int[][] rotated = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rotated[j][n - 1 - i] = mat[i][j];
                }
            }

            return rotated;
        }
    }

