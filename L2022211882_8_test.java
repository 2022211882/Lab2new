
import static org.junit.Assert.assertEquals;

import org.example.Solution8;
import org.junit.Test;

public class L2022211882_8_test {

    /**
     * 测试目的：验证空网格的处理。
     * 测试用例：空网格应该返回0个岛屿。
     */
    @Test
    public void testEmptyGrid() {
        Solution8 solution = new Solution8();
        char[][] grid = {};
        assertEquals(0, solution.numIslands(grid));
    }

    /**
     * 测试目的：验证单行单列网格。
     * 测试用例：1x1网格包含一个陆地或水域的情况。
     */
    @Test
    public void testSingleElementGrid() {
        Solution8 solution = new Solution8();

        char[][] grid1 = {{'1'}};
        assertEquals(1, solution.numIslands(grid1));

        char[][] grid2 = {{'0'}};
        assertEquals(0, solution.numIslands(grid2));
    }

    /**
     * 测试目的：验证典型的多行多列网格。
     * 测试用例：测试包含多个岛屿的网格。
     */
    @Test
    public void testMultipleIslands() {
        Solution8 solution = new Solution8();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, solution.numIslands(grid));
    }

    /**
     * 测试目的：验证全为水域的网格。
     * 测试用例：测试全为'0'的网格，应该返回0个岛屿。
     */
    @Test
    public void testAllWater() {
        Solution8 solution = new Solution8();
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        assertEquals(0, solution.numIslands(grid));
    }

    /**
     * 测试目的：验证全为陆地的网格。
     * 测试用例：测试全为'1'的网格，应该返回1个岛屿。
     */
    @Test
    public void testAllLand() {
        Solution8 solution = new Solution8();
        char[][] grid = {
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'}
        };
        assertEquals(1, solution.numIslands(grid));
    }

    /**
     * 测试目的：验证边界值。
     * 测试用例：测试岛屿位于网格边界上的情况。
     */
    @Test
    public void testIslandsAtGridEdges() {
        Solution8 solution = new Solution8();
        char[][] grid = {
                {'1', '0', '0', '1'},
                {'0', '0', '0', '0'},
                {'1', '0', '0', '1'}
        };
        assertEquals(4, solution.numIslands(grid));
    }
}
