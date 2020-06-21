package bir20.enums;

public class EnumsMain {
    public static void main(String[] args) {
        LengthUnit lengthUnit = LengthUnit.METER;
        System.out.println(lengthUnit);
        lengthUnit = LengthUnit.INCH;
        System.out.println(lengthUnit);
        printLengthUnit(lengthUnit);

        double size = LengthUnit.CENTIMETER.converterToMeter();

        for (LengthUnit len :
                LengthUnit.values()) {
            System.out.println(len);

        }
    }

    private  static void printLengthUnit(LengthUnit lengthUnit) {
        switch (lengthUnit) {
            case INCH:
                System.out.println("Coliai");
                break;
            case METER:
                System.out.println("Metrai");
                break;
            case CENTIMETER:
                System.out.println("Centimentrai");
                break;
            case FOOT:
                System.out.println("Pedos");
                break;
        }
    }
}
