package pers.gxy.leetcode.n957;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

/**
 * google 问题
 * 
 * @author gaoxiuya
 *
 */
public class Solution2 {
    // public List<Integer> cellCompete(int[] states, int days)
    public List<Integer> prisonAfterNDays(int[] states, int days) {
        int j = days;
        while (j > 0) {
            int[] nextCells = new int[states.length];
            for (int i = 0; i < states.length; i++) {
                if (i == 0) {
                    if (states[i + 1] == 0)
                        nextCells[i] = 0;
                    else
                        nextCells[i] = 1;
                } else if (i == states.length - 1)
                    if (states[i - 1] == 0)
                        nextCells[i] = 0;
                    else
                        nextCells[i] = 1;
                else if (states[i - 1] == states[i + 1]) {
                    nextCells[i] = 0;
                } else
                    nextCells[i] = 1;

            }
            // System.out.printf("第%d天数组是：", N - j+1);
            // printCells(nextCells);
            states = nextCells;
            j--;
        }
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < states.length; i++) {
            list.add(states[i]);
            
        }
        return list;

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
        // int[] cells = { 1, 0, 0, 0, 0, 1, 0, 0 };
        int N = 7;
        int[] output = { 0, 0, 1, 1, 0, 0, 0, 0 };
        // int[] output = { 0, 1, 0, 0, 1, 0, 1, 0 };
        Solution2 s = new Solution2();
        s.prisonAfterNDays(cells, N);

    }
}