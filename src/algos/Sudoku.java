package algos;

public class Sudoku {
    private static boolean is_safe(int[][] board, int row, int col, int num) {
        for (int d = 0; d < 9; d++) {
            if (board[row][d] == num)
                return false;
        }

        for (int r = 0; r < 9; r++) {
            if (board[r][col] == num)
                return false;
        }

        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;
        for (int r = boxRowStart; r < boxRowStart + 3; r++) {
            for (int d = boxColStart; d < boxColStart + 3; d++) {
                if (board[r][d] == num)
                    return false;
            }
        }
        return true;
    }

    public static boolean solve(int[][] board) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty)
                break;
        }
        if (isEmpty)
            return true;

        for (int num = 0; num <= 9; num++) {
            if (is_safe(board, row, col, num)) {
                board[row][col] = num;
                if (solve(board))
                    return true;
                else
                    board[row][col] = 0;
            }
        }
        return false;
    }

    public static void print(int[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int d = 0; d < 9; d++) {
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.println();
            if ((r + 1) % 3 == 0)
                System.out.print("");
        }
    }

    public static int[][] to_board(String[] string) {
        int[][] board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            String[] row_i = string[i].split("");
            for (int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(row_i[j]);
            }
        }
        return board;
    }
}
