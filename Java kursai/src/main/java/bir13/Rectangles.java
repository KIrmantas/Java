package bir13;

import java.util.Arrays;

public class Rectangles {

    public static void main(String[] args) {
        double[][] rect1 = {{0, 0}, {0, 3}, {4, 3}, {4, 0}};
        double[][] rect2 = {{4, 3}, {4, 0}, {0, 0}, {0, 3}};
        boolean equalRectangle = true;
        for (int i = 0; i < 4; i++) {
            boolean equalPoints = false;
            for (int j = 0; j < 4; j++) {
                if (Arrays.equals(rect1[i], rect2[j])) {
                    equalPoints = true;
                    break;
                }
            }
            equalRectangle = equalRectangle && equalPoints;
        }
        String rect1Str = arrayString(rect1);
        String rect2Str = arrayString(rect2);
        System.out.printf("Staciakampis %s ir\nstaciakampis %s\nsutampa: %s",
                rect1Str, rect2Str, equalRectangle);
    }

    public static String arrayString(double[][] x) {
        StringBuilder rez = new StringBuilder("[");
        for (int i = 0; i < 4; i++) {
            rez.append(i == 0 ? "" : ", ");
            rez.append(Arrays.toString(x[i]));
        }
        return rez + "]";
    }
}
