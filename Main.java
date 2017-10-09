package stu.vt41.mandrikova_b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество спортивного инвентаря: ");
        Sports_eq[] sports_eq = new Sports_eq[scanner.nextInt()];
        initSports_eqs(sports_eq);


    }

    public static void initSports_eqs(Sports_eq[] sports_eqs){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < sports_eqs.length; i++){
            System.out.print("Выберете тип инвентаря: \n"
                    + "1 - Волейбольный_мяч;\n"
                    + "2 - Теннисный_мяч;\n"
                    + "3 - Ракетка;\n"
                    + "4 - Метательное_копье;\n"
                    + "5 - Штанга;\n"
                    + "6 - Гиря;\n");

            switch (scanner.nextInt()){
                case 1: sports_eqs[i] = new Volleyball();
                    ((Volleyball)sports_eqs[i]).init(scanner);
                    break;
                case 2: sports_eqs[i] = new Tennis_Ball();
                    ((Tennis_Ball)sports_eqs[i]).init(scanner);
                    break;
                case 3: sports_eqs[i] = new Racket();
                    ((Racket)sports_eqs[i]).init(scanner);
                    break;
                case 4: sports_eqs[i] = new Javelin();
                    ((Javelin)sports_eqs[i]).init(scanner);
                    break;
                case 5: sports_eqs[i] = new Barbell();
                    ((Barbell)sports_eqs[i]).init(scanner);
                    break;
                case 6: sports_eqs[i] = new Bob();
                    ((Bob)sports_eqs[i]).init(scanner);
                    break;
                default:
                    System.out.println("Не верно введено название инвентаря");

            }
        }
        System.out.println("Инвентарь, относящийся к теннису:\n"+(Tennis_in(sports_eqs)).toString());
    }










    //поиск инвентаря, относящегося к теннису


    public static Sports_eq Tennis_in(Sports_eq[] sports_eqs){
        Sports_eq Tennis_in = sports_eqs[0];
        for(Sports_eq anSports_eqs : sports_eqs)
            if ("Tennis" == anSports_eqs.getSportType())
                Tennis_in = anSports_eqs;
        return Tennis_in;
    }
}