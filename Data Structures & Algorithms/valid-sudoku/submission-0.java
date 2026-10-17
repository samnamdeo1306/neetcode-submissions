class Solution {
    private final int NUM_COL_ROWS = 9;
    private final int NUM_GRID_COL_ROWS = 3;
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < NUM_COL_ROWS; i++) {
            if(!checkRow(i, board))
                return false;
            if(!checkColumn(i, board))
                return false;
            if(!checkGrid(i, board))
                return false;
        }

        return true;
    }

    private boolean checkRow(int row, char[][] board) {
        Set<Integer> rowSet = new HashSet<>();
        for(int column = 0; column < NUM_COL_ROWS; column++) {
            int num = board[row][column];
            if(num == '.')
                continue;
            else if (rowSet.contains(num))
                return false;
            else
                rowSet.add(num);
        }
        return true;
    }

    private boolean checkColumn(int column, char[][] board) {
        Set<Integer> colSet = new HashSet<>();
        for(int row = 0; row < NUM_COL_ROWS; row++) {
            int num = board[row][column];
            if(num == '.')
                continue;
            else if (colSet.contains(num))
                return false;
            else
                colSet.add(num);
        }
        return true;
    }

    private boolean checkGrid(int grid, char[][] board) {
        Set<Integer> gridSet = new HashSet<>();
        System.out.println("grid : " + grid);
        for(int row = (grid / 3) * 3; row < (grid / 3) * 3 + NUM_GRID_COL_ROWS; row++) {
            for(int column = (grid % 3) * 3; column < (grid % 3) * 3 + NUM_GRID_COL_ROWS; column++) {
                System.out.println("row : " + row + "col : " + column);
                int num = board[row][column];
                if(num == '.')
                    continue;
                else if (gridSet.contains(num))
                    return false;
                else
                    gridSet.add(num);
            }
        }
        return true;
    }
}
