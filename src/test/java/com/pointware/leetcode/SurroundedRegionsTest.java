package com.pointware.leetcode;

import com.pointware.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SurroundedRegionsTest implements TestCase {

    @Test
    @Override
    public void basicTest() {
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        SurroundedRegions.solve(board);

        assertArrayEquals(board, new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
        });
    }

    @Test
    public void borderTest(){
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'X', 'O', 'X'}
        };
        SurroundedRegions.solve(board);

        assertArrayEquals(board, new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'X', 'O', 'X'}
        });
    }

    @Test
    public void caseTest(){
        char[][] board = new char[][]{
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'X', 'O', 'O', 'X'},
                {'O', 'X', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'O', 'O'},
                {'X', 'X', 'X', 'X', 'X'},
        };
        SurroundedRegions.solve(board);

        assertArrayEquals(board, new char[][]{
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'X', 'O', 'O', 'X'},
                {'O', 'X', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'O', 'O'},
                {'X', 'X', 'X', 'X', 'X'},
        });
    }

    @Test
    public void inputTest(){
        char[][] board = new char[][]{};
        SurroundedRegions.solve(board);
    }
}
