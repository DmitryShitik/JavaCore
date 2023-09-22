import java.util.Scanner;

public class GameLogic {
    Scanner in = new Scanner(System.in);
    private char symbolPlayer;
    private int gameStep;
    Field field = new Field();
    public GameLogic() {
        symbolPlayer = 'X';
        gameStep = 0;
    }
    public void GameRun() {
        System.out.println("Старт игры");
        while (true) {
            field.ShowGrid();
            int plRow = in.nextInt() - 1;
            int plCol = in.nextInt() - 1;
            if (correctMove(plRow, plCol)) {
                makeMove(plRow, plCol, symbolPlayer);
                if (gameStep > 8) {
                    System.out.println("Ничья!");
                    break;
                }
                if (checkWin()) {
                    System.out.println("Игрок " + symbolPlayer + " победил!");
                    break;
                }
                switchPlayer();
                System.out.println();
                botMove();
                if (checkWin()) {
                    System.out.println("Игрок " + symbolPlayer + " победил!");
                    break;
                }
                switchPlayer();
            } else {
                System.out.println("Не правильная ячейка");
            }
        }
        field.ShowGrid();
    }
    private   void makeMove(int row, int col, char symbolPlayer) {
        field.setSymbol(row, col, symbolPlayer);
        gameStep++;
    }
    private boolean correctMove(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && field.ReturnSymbol(row, col) == '-');
    }
    private void switchPlayer() {
        symbolPlayer = symbolPlayer == 'X' ? 'O' : 'X';
    }
    private void botMove() {
        int row, col;
        do {
            row = (int) (Math.random() * 3);
            col = (int) (Math.random() * 3);
        } while (!correctMove(row, col));
        makeMove(row, col, symbolPlayer);
    }
    private boolean checkWin() {

        for (int row = 0; row < 3; row++) {
            if (field.ReturnSymbol(row, 0) == symbolPlayer && field.ReturnSymbol(row, 1) == symbolPlayer && field.ReturnSymbol(row, 2) == symbolPlayer) {
                return true;
            }
        }
        for (int col = 0; col < 3; col++) {
            if (field.ReturnSymbol(0, col) == symbolPlayer && field.ReturnSymbol(1, col) == symbolPlayer && field.ReturnSymbol(2, col) == symbolPlayer) {
                return true;
            }

        }
        if (field.ReturnSymbol(0, 0) == symbolPlayer && field.ReturnSymbol(1, 1) == symbolPlayer && field.ReturnSymbol(2, 2) == symbolPlayer) {
            return true;
        }
        if (field.ReturnSymbol(0, 2) == symbolPlayer && field.ReturnSymbol(1, 1) == symbolPlayer && field.ReturnSymbol(2, 0) == symbolPlayer) {
            return true;
        }
        return false;
    }
}
