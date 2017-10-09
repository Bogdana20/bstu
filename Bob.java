package stu.vt41.mandrikova_b;

import java.util.Scanner;

public class Bob extends Coaching {
    private int number_in = 0;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите инвентарный номер ");
        this.number_in = scanner.nextInt();
    }

    public String toString() {
        return (getName() + "{" + getSportType() + "; " + getWeight() + "; " + number_in + "}");
    }
}

