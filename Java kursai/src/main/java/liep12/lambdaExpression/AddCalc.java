package liep12.lambdaExpression;

public class AddCalc implements LambdaCalc {
    @Override
    public double apply(double a, double b) {
        return a + b;
    }
}
