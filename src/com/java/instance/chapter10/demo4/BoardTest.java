package com.java.instance.chapter10.demo4;

/**
 * ClassName BoardTese
 * Description
 * Author wyv
 */



public class BoardTest {

    static int[][] board;
    BoardTest(int size){
        this.board = new int[size][size];
    }

    public void chessBoard(int tr, int tc, int dr, int dc, int size){
        int s = size/2;
        int dr0 = dr;
        int dc0 = dc;
        int dr1,dr2,dr3,dc1,dc2,dc3;
        if(s == 0){
            return;
        }

        if(dr < tr + s && dc < tc + s){
            dr1 = tr + s;dc1 = tc + s;
            dr2 = tr + s - 1;dc2 = tc + s;
            dr3 = tr + s;dc3 = tc + s-1;
            board[dr1][dc1] = 1;
            board[dr2][dc2] = 1;
            board[dr3][dc3] = 1;
            chessBoard(tr,tc,dr0,dc0,s);
            chessBoard(tr+s,tc+s,dr1,dc1,s);
            chessBoard(tr,tc+s,dr2,dc2,s);
            chessBoard(tr+s,tc,dr3,dc3,s);
        }
        else if(dr < tr + s && dc >= tc + s){
            dr1 = tr + s - 1;dc1 = tc + s - 1;
            dr2 = tr + s;dc2 = tc + s - 1;
            dr3 = tr + s;dc3 = tc + s;
            board[dr1][dc1] = 2;
            board[dr2][dc2] = 2;
            board[dr3][dc3] = 2;
            chessBoard(tr,tc+s,dr0,dc0,s);
            chessBoard(tr,tc,dr1,dc1,s);
            chessBoard(tr+s,tc,dr2,dc2,s);
            chessBoard(tr+s,tc+s,dr3,dc3,s);


        }
        else if(dr >= tr + s && dc < tc + s){
            dr1 = tr + s - 1;dc1 = tc + s - 1;
            dr2 = tr + s - 1;dc2 = tc + s;
            dr3 = tr + s;dc3 = tc + s;
            chessBoard(tr+s,tc,dr0,dc0,s);
            chessBoard(tr,tc,dr1,dc1,s);
            chessBoard(tr,tc+s,dr2,dc2,s);
            chessBoard(tr+s,tc+s,dr3,dc3,s);
            board[dr1][dc1] = 3;
            board[dr2][dc2] = 3;
            board[dr3][dc3] = 3;
        }

        else if(dr >= tr + s && dc >= tc + s){
            dr1 = tr + s - 1;dc1 = tc + s - 1;
            dr2 = tr + s;dc2 = tc + s - 1;
            dr3 = tr + s - 1;dc3 = tc + s;
            chessBoard(tr+s,tc+s,dr0,dc0,s);
            chessBoard(tr,tc,dr1,dc1,s);
            chessBoard(tr+s,tc,dr2,dc2,s);
            chessBoard(tr,tc+s,dr3,dc3,s);
            board[dr1][dc1] = 4;
            board[dr2][dc2] = 4;
            board[dr3][dc3] = 4;
        }
}

    public static void main(String[] args) {
        long startTime=System.nanoTime();   //获取开始时间
        int size = 32;
        BoardTest boardTest = new BoardTest(size);
        boardTest.chessBoard(0,0,2,2,size);
        for (int i = 0;i <size;i++){
            for(int j = 0;j<size;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
    }
}
