package stu.vt41.mandrikova_b;

import java.util.Scanner;

public class Javelin extends Sports_eq {
    private int Weight = 0;

    @Override
    public void init(Scanner scanner) {
        System.out.println("Ввод наименования (производителя) метательного копья ");
        setName(scanner.next());
        System.out.println("Ввод типа метательного копья ");
        setSportType(scanner.next());
        System.out.println("Ввод веса метательного копья ");
        this.Weight = scanner.nextInt();
    }
    public String toString() {
        return (getName()  + getSportType() + "{" + Weight + "}");
    }
}