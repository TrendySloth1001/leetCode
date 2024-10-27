import java.util.*;

 class Solution {
    
    private List<Integer> collectDiagonal(int[][] mat, int i, int j) {
        List<Integer> diagonal = new ArrayList<>();
        while (i < mat.length && j < mat[0].length) {
            diagonal.add(mat[i][j]);
            i++;
            j++;
        }
        return diagonal;
    }

    public int[][] diagonalSort(int[][] mat) {
        for (int j = 0; j < mat[0].length; j++) {
            List<Integer> diagonal = collectDiagonal(mat, 0, j);
            Collections.sort(diagonal);
            int i = 0, k = j;
            for (int val : diagonal) {
                mat[i][k] = val;
                i++;
                k++;
            }
        }

        for (int i = 1; i < mat.length; i++) {
            List<Integer> diagonal = collectDiagonal(mat, i, 0);
            Collections.sort(diagonal);
            int j = 0, k = i;
            for (int val : diagonal) {
                mat[k][j] = val;
                j++;
                k++;
            }
        }

        return mat;
    }
}
