package pers.gxy.leetcode.n200;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
@DisplayName("测试有几个小岛")
public class TestSolution {
    @Test
    @DisplayName("Example 1")
    void e1() {
        char[][] in = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '0', '0', '0' } };
        int out = 1;
        Solution s = new Solution();
        Assert.assertEquals(out, s.numIslands(in));
    }

    @Test
    @DisplayName("Example 2")
    void e2() {
        char[][] in = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' }, { '0', '0', '0', '1', '1' } };
        int out = 3;
        Solution s = new Solution();
        Assert.assertEquals(out, s.numIslands(in));
    }
}
