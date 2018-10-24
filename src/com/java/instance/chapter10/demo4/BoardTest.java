package com.java.instance.chapter10.demo4;

/**
 * ClassName BoardTese
 * Description
 * Author wyv
 * Create Time 2018-10-24 21:22
 */



public class BoardTest {

    static int size = 8;
    static int[][] board = new int[size][size];

    public void chessBoard(int dr, int dc, int size){
        int s = size/2;
        int dr0 = dr;
        int dc0 = dc;
        board[dr0][dc0] = 5;
        int dr1,dr2,dr3,dc1,dc2,dc3;
        if(s == 1)return;
        if(dc < s && dr <= s){
            dr1 = s;dc1 = s;
            dr2 = s-1;dc2 = s;
            dr3 = s;dc3 = s-1;
            chessBoard(dr0,dc0,s);
            chessBoard(dr1,dc1,s);
            chessBoard(dr2,dc2,s);
            chessBoard(dr3,dc3,s);
            board[dr1][dc1] = 1;
            board[dr2][dc2] = 1;
            board[dr3][dc3] = 1;
        }
        else if(dc < s && dr > s){
            dr1 = s-1;dc1 = s-1;
            dr2 = s-1;dc2 = s;
            dr3 = s;dc3 = s;
            chessBoard(dr0,dc0,s);
            chessBoard(dr1,dc1,s);
            chessBoard(dr2,dc2,s);
            chessBoard(dr3,dc3,s);
            board[dr1][dc1] = 2;
            board[dr2][dc2] = 2;
            board[dr3][dc3] = 2;
        }
        else if(dc > s && dr < s){
            dr1 = s-1;dc1 = s-1;
            dr2 = s;dc2 = s-1;
            dr3 = s;dc3 = s;
            chessBoard(dr0,dc0,s);
            chessBoard(dr1,dc1,s);
            chessBoard(dr2,dc2,s);
            chessBoard(dr3,dc3,s);
            board[dr1][dc1] = 3;
            board[dr2][dc2] = 3;
            board[dr3][dc3] = 3;

        }
        else if(dc > s && dr > s){
            dr1 = s;dc1 = s-1;
            dr2 = s+1;dc2 = s-1;
            dr3 = s;dc3 = s;
            chessBoard(dr0,dc0,s);
            chessBoard(dr1,dc1,s);
            chessBoard(dr2,dc2,s);
            chessBoard(dr3,dc3,s);
            board[dr1][dc1] = 4;
            board[dr2][dc2] = 4;
            board[dr3][dc3] = 4;
        }
    }

    public static void main(String[] args) {
        BoardTest boardTest = new BoardTest();
        boardTest.chessBoard(0,1,8);
        for (int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println(board);

    }
}
