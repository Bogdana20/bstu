package stu.vt41.mandrikova_b;

import java.util.Scanner;

public class Volleyball extends Ball {
    private int number_i = 0;

@Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.println("Введите инвентарный номер волейбольного мяча");
        this.number_i = scanner.nextInt();
    }

    public String toString(){
        return (getName() + "{" + getWeight() + "; " + getRadius() + "; " + this.number_i + "}");
    }
}
