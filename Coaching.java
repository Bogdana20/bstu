package stu.vt41.mandrikova_b;

import java.util.Scanner;

public class Coaching extends Sports_eq {
    private int Weight;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Ввод наименования (производителя) тренажерного инвентаря ");
        setName(scanner.next());
        System.out.println("Ввод типа инвентаря ");
        setSportType(scanner.next());
        System.out.println("Ввод веса инвенраря ");
        this.Weight = scanner.nextInt();
    }

    public int getRadius() {
        return Weight;
    }


    public String toString() {
        return (getName()  + getSportType() + "{" + Weight + "}");
    }
}
