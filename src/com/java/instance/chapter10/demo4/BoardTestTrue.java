/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BoardTestTrue
 * Author:   wuyang
 * Date:     2018/10/26 18:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.instance.chapter10.demo4;

public class BoardTestTrue {

    static int[][] board;
    static int tile = 0;
    BoardTestTrue(int size){
        this.board = new int[size][size];
    }

    public void chessBoard(int tr, int tc, int dr, int dc, int size){
        if(size == 1){
            return;
        }
        int s = size/2;
        int t = ++tile;
        int dr1,dr2,dr3,dr4,dc1,dc2,dc3,dc4;
        dr1 = tr + s - 1;dc1 = tc + s - 1;
        dr2 = tr + s - 1;dc2 = tc + s;
        dr3 = tr + s;    dc3 = tc + s-1;
        dr4 = tr + s;    dc4 = tc + s;
        if(dr < tr + s && dc < tc + s){
            chessBoard(tr,tc,dr,dc,s);
        }
        else{
            board[dr1][dc1] = t;
            chessBoard(tr,tc,dr1,dc1,s);
        }
        if(dr < tr + s && dc >= tc + s){
            chessBoard(tr,tc+s,dr,dc,s);
        }
        else {
            board[dr2][dc2] = t;
            chessBoard(tr,tc+s,dr2,dc2,s);
        }
        if(dr >= tr + s && dc < tc + s){
            chessBoard(tr+s,tc,dr,dc,s);
        }
        else{
            board[dr3][dc3] = t;
            chessBoard(tr+s,tc,dr3,dc3,s);
        }

        if(dr >= tr + s && dc >= tc + s){
            chessBoard(tr+s,tc+s,dr,dc,s);
        }
        else{
            board[dr4][dc4] = t;
            chessBoard(tr+s,tc+s,dr4,dc4,s);
        }
    }

    public static void main(String[] args) {
        long startTime=System.nanoTime();   //获取开始时间
        int size = 32;
        BoardTestTrue boardTestTrue = new BoardTestTrue(size);
        boardTestTrue.chessBoard(0,0,2,2,size);
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