import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (res.size() < m * n) {
            for (int i = left; i <= right && res.size() < m * n; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom && res.size() < m * n; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            for (int i = right; i >= left && res.size() < m * n; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top && res.size() < m * n; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}