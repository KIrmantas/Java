package bir20;

public class PocketMain {
    public static void main(String[] args) {
        Pocket pinigai = new Pocket(35.20);
        System.out.println(pinigai.getMoney());
        pinigai.setMoney(4.8);
        System.out.println(pinigai.getMoney());
        pinigai.addMoney(-32.5);
        System.out.println(pinigai.getMoney());
        pinigai.addMoney(3200);
        System.out.println(pinigai.getMoney());

    }
}
