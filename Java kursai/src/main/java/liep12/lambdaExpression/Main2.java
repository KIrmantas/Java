package liep12.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {

        LambdaCalc addFunction = Double::sum;
        double rez = addFunction.apply(5, 2);
        System.out.println("Add: " + rez);

        LambdaCalc subFunction = (a, b) -> a - b;
        rez = subFunction.apply(7.2, 2.5);
        System.out.println("Sub: " + rez);

        LambdaCalc multiFunction = (a, b) -> a * b;
        rez = multiFunction.apply(7.2, 2.5);
        System.out.println("Multi: " + rez);

        LambdaCalc divisFunction = (a, b) -> (b != 0) ? a / b : 0;
        rez = divisFunction.apply(7.2, 2.5);
        System.out.println("Divide: " + rez);
        rez = divisFunction.apply(7.2, 0);
        System.out.println("Divide: " + rez);

        AddList sumList = new AddList();
        List<Integer> varables =  new ArrayList<>(Arrays.asList(1, 2, 3));
        int rez2 = AddList.apply(varables);
        System.out.println("List sum: " + rez2);

        Function <List<Integer>, Integer> sumList2 = AddList::apply;
        int rez3 = sumList2.apply(varables);
        System.out.println("List sum: " + rez2);



        Function<List<Integer>, Integer> sumList4 = l -> sum(l);
        int rez4 = sumList4.apply(varables);
        System.out.println("List sum: " + rez2);





        List<String> varables2 =  new ArrayList<>();
        varables2.add("This is first line");
        varables2.add("Morel lines");
        varables2.add("A v a w");
        varables2.add("a");

        System.out.println(varables2);
        varables2.sort(String::compareToIgnoreCase);
        System.out.println(varables2);

        Function<List<String>, Integer> sumList5 = l -> sum2(l);
        int rez5 = sumList4.apply(varables);
        System.out.println("List sum: " + rez2);
    }

    private static Integer sum(List<Integer> l) {
             int temp = 0;
            for (int number : l) {
                temp += number;
            }
            return temp;
    }

    private static Integer sum2(List<String> lines) {
        int temp = 0;
        for (String line : lines) {
            temp += line.split(" ").length;
        }
        return temp;
    }

}
//
//    public static void main(String[] args) {
//        Calc add = new AddCalc();
//        Calc addAnonym =
//                new Calc() {
//                    @Override
//                    public double apply(double a, double b) {
//                        return a + b;
//                    }
//                };
//        Calc addLambda = (a, b) -> a + b;
//        Calc mul = (a, b) -> a * b;
//        Calc div = (a, b) -> a / b;
//        Calc sub = (a, b) -> a - b;
//        List<Calc> calculations = new ArrayList<>();
//        calculations.add(add);
//        calculations.add(addAnonym);
//        calculations.add(addLambda);
//        calculations.add(mul);
//        calculations.add(div);
//        calculations.add(sub);
//        double a = 5;
//        double b = 2;
//        for (Calc calc : calculations) {
//            System.out.println(a + " " + b + " = " + calc.apply(a, b));
//        }
//    }