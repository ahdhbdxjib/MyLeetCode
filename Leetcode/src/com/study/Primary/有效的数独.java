package com.study.Primary;

import java.util.HashSet;

public class 有效的数独 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> cell = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            for (int j = 0; j <board[i][j] ; j++) {
                if(board[i][j] != '-' && !row.add(board[i][j])) return false;
                if(board[j][i] != '-' && !cell.add(board[j][i])) return false;
                int rowIndex= 3*(i/3);
                int cellIndex = 3*(i%3);
                if(board[rowIndex + j / 3][cellIndex + j % 3]!= '-'&&!cube.add(board[rowIndex + j / 3][cellIndex + j % 3]))
                    return false;
            }
        }
        return  true;
    }
}
