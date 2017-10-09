package stu.vt41.mandrikova_b;

import java.util.Scanner;

public class Barbell extends Coaching {
    private int number_inv = 0;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите инвентарный номер ");
        this.number_inv = scanner.nextInt();
    }

    public String toString() {
        return (getName() + "{" + getSportType() + "; " + getWeight() + "; " + number_inv + "}");
    }
}