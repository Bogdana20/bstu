package stu.vt41.mandrikova_b;

import java.util.Scanner;

public class Ball extends Sports_eq {
    private int Radius;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Ввод наименования (производителя) инвентаря ");
        setName(scanner.next());
        System.out.println("Ввод типа инвентаря ");
        setSportType(scanner.next());
        System.out.println("Ввод радиуса мяча ");
        this.Radius = scanner.nextInt();
    }

    public int getRadius() {
        return Radius;
    }


    public String toString() {
        return (getName()  + getSportType() + "{" + Radius + "}");
    }
}
