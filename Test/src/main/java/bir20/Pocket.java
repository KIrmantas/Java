package bir20;

/*
Create class Pocket.
a) Add field „money”, create constructor, getter and setter.
b) Add verification for both getter and setter. Getter should result in returning as much money, as the user asked for. It should return 0 if money <= 10.
c) Setter should not accept values below 0 and greater than 3000. It may print a message like „I don’t have enough space in my pocket for as much money!”
*/

public class Pocket {
    private double money;

    public Pocket(double money) {
        this.money = money;
    }

    public double getMoney() {
        if (this.money <= 10) {
            return 0;
        } else {
            return money;
        }
    }

    public void setMoney(double money) {
        if (money >= 0 && money <= 3000) {
            this.money = money;
        } else {
            System.out.println("Pinigu gali buti nuo 0 iki 3000");
        }
    }

    public void addMoney(double money) {
        double temp = this.money + money;
        if (temp >= 0 && temp <= 3000) {
            this.money = temp;
        } else  if (temp < 0) {
            this.money = 0;
            System.out.println("Neigiamo pinigu kiekio negali buti");
        } else {
            this.money = 3000;
            System.out.println("Netelpa daugiau kaip 3000");
        }
    }
}
