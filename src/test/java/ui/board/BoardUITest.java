package ui.board;

import board.Board;

import javax.swing.*;

public class BoardUITest {

    public static void main(String[] args) throws InterruptedException {
        Board board = new Board(new int[][]{
                {0, 0, 0, 0},
                {0, 1, 1, 1},
                {1, 1, 1, 0},
                {0, 0, 0, 0}
        });
        BoardUI boardUI = new BoardUI(
                savedBoard -> System.out.println("保存：" + savedBoard.rowCount() + "行，" + savedBoard.columnCount() + "列"),
                () -> System.out.println("返回")
        );

        JFrame window = new JFrame();
        window.setSize(640, 480);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.add(boardUI);
        window.setVisible(true);

        boardUI.setBoard(board);
    }
}