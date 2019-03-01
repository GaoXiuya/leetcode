package pers.gxy.leetcode.n200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 * <div>
 * <p>
 * Given a 2d grid map of <code>'1'</code>s (land) and <code>'0'</code>s
 * (water), count the number of islands. An island is surrounded by water and is
 * formed by connecting adjacent lands horizontally or vertically. You may
 * assume all four edges of the grid are all surrounded by water.
 * </p>
 * 
 * <p>
 * <b>Example 1:</b>
 * </p>
 * 
 * <pre>
 * <strong>Input:</strong>
11110
11010
11000
00000

<strong>Output:</strong>&nbsp;1
 * </pre>
 * 
 * <p>
 * <b>Example 2:</b>
 * </p>
 * 
 * <pre>
 * <strong>Input:</strong>
11000
11000
00100
00011

<strong>Output: </strong>3
 * </pre>
 * 
 * </div>
 * 
 * @author gaoxiuya
 *
 */
public class Solution {
    public int numIslands(char[][] grid) {
        // List< Vector<Point> >
        // Vector<Point> vector= new Vector<>();
        // int i=0,j=0;
        // vector.add(new Point(i, j));
        // vector.get(0);
        printGrid(grid);
        int gridWidth = grid[0].length;
        int gridLength = grid.length;

        char[][] gridT = new char[gridWidth][gridLength];
        for (int i = 0; i < gridLength; i++) {
            for (int j = 0; j < gridWidth; j++) {
                // if (j > i) {
                gridT[j][i] = grid[i][j];
                // }
            }

        }
        printGrid(gridT);
        return 0;

    }

    void printGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            char[] cs = grid[i];
            for (int j = 0; j < cs.length; j++) {
                char c = cs[j];
                System.out.printf("%s", c);
            }
            System.out.println();
        }
        System.out.println("=============");
    }

    class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + x;
            result = prime * result + y;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Point other = (Point) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (x != other.x)
                return false;
            if (y != other.y)
                return false;
            return true;
        }

        private Solution getOuterType() {
            return Solution.this;
        }

    }

    public static void main(String[] args) {
        char[][] in = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '0', '0', '0' } };
        Solution s = new Solution();
        s.numIslands(in);
    }
}