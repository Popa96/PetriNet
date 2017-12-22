package Petri;
import Petri.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CoffeMachine extends PetriNet{

       public CoffeMachine() {
           Locatie locatie1 = new Locatie("0", 1);
           Locatie locatie2 = new Locatie("5", 0);
           Locatie locatie3 = new Locatie("10", 0);
           Locatie locatie4 = new Locatie("15", 0);

           Arc arc05in = new Arc(locatie2, 1, "in");
           Arc arc05out = new Arc(locatie1, 1, "out");

           Arc arc010in = new Arc(locatie3, 1, "in");
           Arc arc010out = new Arc(locatie1, 1, "out");

           Arc arc510in = new Arc(locatie3, 1, "in");
           Arc arc510out = new Arc(locatie2, 1, "out");

           Arc arc515in = new Arc(locatie4, 1, "in");
           Arc arc515out = new Arc(locatie2, 1, "out");

           Arc arc1015in = new Arc(locatie4, 1, "in");
           Arc arc1015out = new Arc(locatie3, 1, "out");

           Arc arc100in = new Arc(locatie1, 1, "in");
           Arc arc100out = new Arc(locatie3, 1, "out");

           Arc arc155in = new Arc(locatie2, 1, "in");
           Arc arc155out = new Arc(locatie4, 1, "out");

           Arc arc150in = new Arc(locatie1, 1, "in");
           Arc arc150out = new Arc(locatie4, 1, "out");

           Tranzitie tranzitie05 = new Tranzitie(Arrays.asList(arc05in, arc05out), "5");
           Tranzitie tranzitie010 = new Tranzitie(Arrays.asList(arc010in, arc010out), "10");
           Tranzitie tranzitie510 = new Tranzitie(Arrays.asList(arc510in, arc510out), "5");
           Tranzitie tranzitie515 = new Tranzitie(Arrays.asList(arc515in, arc515out), "10");
           Tranzitie tranzitie100 = new Tranzitie(Arrays.asList(arc100in, arc100out), "C10");
           Tranzitie tranzitie1015 = new Tranzitie(Arrays.asList(arc1015in, arc1015out), "5");
           Tranzitie tranzitie155 = new Tranzitie(Arrays.asList(arc155in, arc155out), "C10");
           Tranzitie tranzitie150 = new Tranzitie(Arrays.asList(arc150in, arc150out), "C15");

           this.tranzitie = Arrays.asList(tranzitie05, tranzitie010, tranzitie510, tranzitie515, tranzitie100, tranzitie1015, tranzitie155, tranzitie150);
       }
    @Override
    public void Mesaj(String actiune) {

           if(actiune.equals("C15"))
           {
               System.out.println("Cafea15 se prepara");
           }
           else if (actiune.equals("C10")){
               System.out.println("Cafeaua10 se prepara");
           }
           else if (actiune.equals("5"))
           {
               System.out.println("Credit 5 lei ");
           }
           else if(actiune.equals("10"))
           {
               System.out.println("Credit 10 lei ");
           }
           else {
               System.out.println("Fara comanda");
           }

    }
}
