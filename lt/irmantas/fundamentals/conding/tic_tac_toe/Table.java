package lt.irmantas.fundamentals.conding.tic_tac_toe;

public class Table {
    int[][] table;

    public Table() {
        this.table = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                str.append(table[i][j] == 1 ? " O " :
                        table[i][j] == -1 ? " X " : "   ");
                if (j != 2) {
                    str.append("|");
                } else {
                    str.append("\n");
                }
            }
            if (i != 2) {
                str.append("---+---+---\n");
            }
        }
        return str.toString();
    }

    public void setTableValue(int x, int y, int player) {
        table[x][y] = player;
    }

    public boolean busyCell(int x, int y) {
        return table[x][y] != 0;
    }

    public boolean isWiner() {
        return Math.abs(table[0][0] + table[0][1] + table[0][2]) == 3 ||
                Math.abs(table[1][0] + table[1][1] + table[1][2]) == 3 ||
                Math.abs(table[2][0] + table[2][1] + table[2][2]) == 3 ||
                Math.abs(table[0][0] + table[1][0] + table[2][0]) == 3 ||
                Math.abs(table[0][1] + table[1][1] + table[2][1]) == 3 ||
                Math.abs(table[0][2] + table[1][2] + table[2][2]) == 3 ||
                Math.abs(table[0][0] + table[1][1] + table[2][2]) == 3 ||
                Math.abs(table[0][2] + table[1][1] + table[2][0]) == 3;

/*
        return Math.abs(Arrays.stream(table[0]).sum()) == 3 ||
                Math.abs(Arrays.stream(table[1]).sum()) == 3 ||
                Math.abs(Arrays.stream(table[2]).sum()) == 3 ||
                Math.abs(IntStream.range(0, 2).map(i -> table[i][0]).sum()) == 3 ||
                Math.abs(IntStream.range(0, 2).map(i -> table[i][1]).sum()) == 3 ||
                Math.abs(IntStream.range(0, 2).map(i -> table[i][2]).sum()) == 3 ||
                Math.abs(IntStream.range(0, 2).map(i -> table[i][i]).sum()) == 3 ||
                Math.abs(IntStream.range(0, 2).map(i -> table[i][2 - i]).sum()) == 3;
*/
    }
}
