package stu.vt41.mandrikova_b;

import java.util.Scanner;

public class Racket extends Sports_eq {
    private int Weight = 0;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Ввод наименования (производителя) ракетки ");
        setName(scanner.next());
        System.out.println("Ввод типа ракетки ");
        setSportType(scanner.next());
        System.out.println("Ввод веса ракетки ");
        this.Weight = scanner.nextInt();
    }
    public String toString() {
        return (getName()  + getSportType() + "{" + Weight + "}");
    }
}
