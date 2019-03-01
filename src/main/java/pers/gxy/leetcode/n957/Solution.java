package pers.gxy.leetcode.n957;

import org.junit.Assert;

public class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
//        printCells(cells);

        int j = N;
        while (j > 0) {
            int[] nextCells = new int[cells.length];
            for (int i = 0; i < cells.length; i++) {
//                System.out.printf("第%d位：",i);
//                printCells(nextCells);
                if (i == 0) {
                    if (cells[i + 1] == 0)
                        nextCells[i] = 0;
                    else
                        nextCells[i] = 1;
                } else if (i == cells.length - 1)
                    if (cells[i - 1] == 0)
                        nextCells[i] = 0;
                    else
                        nextCells[i] = 1;
                else if (cells[i - 1] == cells[i + 1]) {
                    nextCells[i] = 0;
                } else
                    nextCells[i] = 1;

            }
            System.out.printf("第%d天数组是：", N - j);
            printCells(nextCells);
            cells = nextCells;
            j--;
        }
        return cells;

    }

    private void printCells(int[] cells) {
        for (int i = 0; i < cells.length; i++) {
            int j = cells[i];
            if (i == 0)
                System.out.printf("[%d,", j);
            else if (i == cells.length - 1)
                System.out.printf("%d]\r\n", j);
            else
                System.out.printf("%d,", j);

        }

    }

    public static void main(String[] args) {
         int[] cells = { 0, 1, 0, 1, 1, 0, 0, 1 };
//        int[] cells = { 1, 0, 0, 0, 0, 1, 0, 0 };
        int N = 7;
         int[] output = { 0, 0, 1, 1, 0, 0, 0, 0 };
//        int[] output = { 0, 1, 0, 0, 1, 0, 1, 0 };
        Solution s = new Solution();
        s.prisonAfterNDays(cells, N);

    }
}