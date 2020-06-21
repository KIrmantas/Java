package bir20.enums;

public enum LengthUnit {
    METER(1, "Metrai"),
    CENTIMETER(0.01, "Centimetrai"),
    FOOT(0.3, "Pedos"),
    INCH(0.025, "Coliai");

    private double value;
    private String name;

    LengthUnit(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public double converterToMeter(){
        return value;
    }

    @Override
    public String toString() {
        return name + " : " + this.value;
    }}
