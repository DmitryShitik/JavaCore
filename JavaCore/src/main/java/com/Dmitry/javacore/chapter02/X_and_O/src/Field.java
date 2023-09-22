public class Field {
    private final char[][] grid;
    private final int row = 3;
    private final int col = 3;
    public Field() {
        grid = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = '-';
            }
        }
    }
    public void ShowGrid(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public char ReturnSymbol(int row,int col){
        return grid[row][col];
    }
    public void setSymbol(int row,int col, char currentPlayer){
        grid[row][col]=currentPlayer;
    }
}
