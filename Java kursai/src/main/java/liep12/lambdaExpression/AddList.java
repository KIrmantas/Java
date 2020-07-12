package liep12.lambdaExpression;

import java.util.List;

public class AddList implements LambdaCalcList {

    public static int apply(List<Integer> list) {
        int sum = 0;
        for (int x :
                list) {
            sum += x;
        }
        return sum;
    }
}
