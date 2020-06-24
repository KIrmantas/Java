package bir21.uzduotis4;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {
    public static void main(String[] args) {
        int numbers = 5;
        List<List<Integer>> table = new ArrayList<>();
        for (int i = 1; i <= numbers; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 1; j <= numbers; j++) {
                rows.add(i * j);
            }
            table.add(rows);
        }

        for (int i = 1; i <= table.size(); i++) {
            List<Integer> row = table.get(i - 1);
            for (int j = 1; j <= row.size(); j++) {
                System.out.printf("%2d * %2d = %3d\n", i, j, row.get(j - 1));
            }
        }

    }
}
