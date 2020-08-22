package Variant2;

public enum Nominals {
    HUNDER500(500),
    HUNDER200(200),
    Hunder100(100),
    TEN50(50),
    Ten20(20),
    Ten10(10),
    FIVE(5),
    TWO(2),
    ONE(1);

    private Integer nominal;

    Nominals(Integer nominal) {
        this.nominal = nominal;
    }

    public Integer getNominal() {
        return nominal;
    }
}
