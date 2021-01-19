package com.daa.finalweeks;

public class Snail {

    static int[] snail(int[][] array) {
        if (array[0].length == 0) return new int[0];

        int rows = array.length;
        int columns = array[0].length;
        int[] result = new int[rows * columns];
        boolean[][] hosted = new boolean[rows][columns];
        int x = 0, y = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = array[y][x];
            hosted[y][x] = true;
            if (validator(hosted, x + 1, y) && !validator(hosted, x, y - 1))
                x++;
            else if (validator(hosted, x, y + 1))
                y++;
            else if (validator(hosted, x - 1, y))
                x--;
            else
                y--;
        }
        return result;
    }

    private static boolean validator(boolean[][] visited, int column, int row) {
        return row >= 0 && row < visited.length && column >= 0 && column < visited[0].length && !visited[row][column];
    }
}
