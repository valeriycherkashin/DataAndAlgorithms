package com.daa.seventhweek;
import java.util.List;

class ConnectFour {
    static String whoIsWinner(List<String> piecesPositionList) {
        String[][] field = new String[7][6];
        for (String piece : piecesPositionList) {
            int column = piece.charAt(0) - 65, row = 0;
            for (; row < field[column].length - 1 && field[column][row] != null; row++);

            field[column][row] = piece.substring(2);
            for (int[] step : new int[][] {{0, 1}, {1, 0}, {1, 1}, {1, -1}}) {
                String result = move(column, row, step, field[column][row], field);
                if (!result.isEmpty()) {
                    return result;
                }
            }
        }
        return "Draw";
    }

    static String move(int column, int row, int[] step, String par, String[][] board) {
        for (int n = 0, f = 1; f > -2; f -= 2) {
            for (int c = column, r = row;
                 c >= 0 && c < board.length && r >= 0 && r < board[c].length && par.equals(board[c][r]);
                 c += step[0] * f, r += step[1] * f) {
                if (++n > 4)
                    return par;
            }
        }
        return "";
    }
}


