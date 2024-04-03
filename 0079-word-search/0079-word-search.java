 class Solution {
    private char[][] board;
    private int ROWS;
    private int COLS;
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.ROWS = board.length;
        this.COLS = board[0].length;
        this.visited = new boolean[ROWS][COLS];

        for (int row = 0; row < this.ROWS; ++row) {
            for (int col = 0; col < this.COLS; ++col) {
                if (this.backtrack(row, col, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean backtrack(int row, int col, String word, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || row == this.ROWS || col < 0 || col == this.COLS || this.visited[row][col] || this.board[row][col] != word.charAt(index)) {
            return false;
        }

        this.visited[row][col] = true;
        int[] rowOffsets = {0, 1, 0, -1};
        int[] colOffsets = {1, 0, -1, 0};
        for (int d = 0; d < 4; ++d) {
            if (backtrack(row + rowOffsets[d], col + colOffsets[d], word, index + 1)) {
                return true;
            }
        }
        this.visited[row][col] = false;
        return false;
    }
}
