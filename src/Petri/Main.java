package Petri;

import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {
        String optiune;
        Scanner scanner=new Scanner(System.in);

        CoffeMachine coffeMachine=new CoffeMachine();
        do {
            System.out.println("inttroduceti optiunea dvs");
            optiune = scanner.next();
            coffeMachine.execut(optiune);
           // coffeMachine.Mesaj(optiune);
        }while(true);
    }
}
