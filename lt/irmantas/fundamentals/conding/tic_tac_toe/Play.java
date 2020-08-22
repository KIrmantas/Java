package lt.irmantas.fundamentals.conding.tic_tac_toe;



public class Play {

    public static void main(String[] args) {
        Table table = new Table();
        Scanner sc = new Scanner(System.in);
        boolean secondPlayerIsComputer = OpponentChoise(sc);
        int player = -1;    // '1' - pirmas žaidėjas, '-1' - antras žaidėjas;
        boolean gameOver = false;

        System.out.println("Langerių numeracija:");
        numeredTable();
        System.out.println(table);

        while (!gameOver) {

            player = -player;
            gameOver = playerCellSeletion(table, sc, player);

            if (!gameOver) {
                player = -player;
                if (secondPlayerIsComputer) {
                    gameOver = computerWaking(table, player);
                } else {
                    gameOver = playerCellSeletion(table, sc, player);
                }
            }
        }
    }

    private static boolean computerWaking(Table table, int player) {
        Random rnd = new Random();
        int cell;
        int x;
        int y;
        boolean isWinner;
        do {
            cell = rnd.nextInt(9);
            x = cell / 3;
            y = cell % 3;
        } while (table.busyCell(x, y));
        System.out.println("Kompiuterio pasirinkimas: " + (cell + 1));
        table.setTableValue(x, y, player);
        System.out.println(table);

        isWinner = table.isWiner();
        if (isWinner) {
            System.out.println("Laimėjo kompiuteris");
            return true;
        } else {
            return false;
        }

    }

    private static boolean playerCellSeletion(Table table, Scanner sc, int player) {
        int cell;
        int x;
        int y;
        boolean isWinner;

        while (true) {
            System.out.printf("%s. Įveskite langelio nr: ", playerName(player));
            cell = sc.nextInt();
            x = (cell - 1) / 3;
            y = (cell - 1) % 3;
            if (table.busyCell(x, y)) {
                System.out.printf("Langelis '%d' jau užimtas. Pasirinkite iš naujo\n", cell);
            } else {
                break;
            }
        }
        table.setTableValue(x, y, player);
        System.out.println(table);

        isWinner = table.isWiner();
        if (isWinner) {
            System.out.println("Laimėjo " + playerName(player));
            return true;
        } else {
            return false;
        }
    }

    private static boolean OpponentChoise(Scanner sc) {
        int number;
        do {
            System.out.println("Antras žaidėjas");
            System.out.println("\t1 - žmogus;");
            System.out.println("\t2 - kompiuteris;");
            System.out.print("Pasirinkite oponentą: ");
            number = sc.nextInt();
            if (number != 1 && number != 2) {
                System.out.println("Klaidingas oponento pasirinkimas");
            }
        } while (number != 1 && number != 2);
        return (number == 2);
    }

    public static String playerName(int player) {
        String str;
        if (player == 1) {
            str = "I žaidėjas";
        } else {
            str = "II žaidėjas";
        }
        return str;
    }

    public static void numeredTable() {
        byte[][] numerics = new byte[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                str.append(" ").append(numerics[i][j]).append(" ");
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
        System.out.println(str);
    }

}
