package Petri;
import Petri.*;

import java.util.Arrays;

public class ReadWrite extends PetriNet {

    public ReadWrite()
    {
        Locatie worker=new Locatie("worker",10);
        Locatie reading=new Locatie("reader",0);
        Locatie writting=new Locatie("writting",0);

        Arc workerReadin=new Arc(reading,1,"in");
        Arc workerReadout=new Arc(worker,1,"out");

        Arc readWorkerin=new Arc(worker,1,"in");
        Arc readWorkerout=new Arc(reading,1,"out");

        Arc workerWrittingin=new Arc(writting,1,"in");
        Arc workerWrittingout=new Arc(worker,1,"out");

        Arc writtingWorkerin=new Arc(worker,1,"in");
        Arc writtingWorkerout=new Arc(writting,1,"out");

        Tranzitie startRead=new Tranzitie(Arrays.asList(workerReadin,workerReadout),"startRead");
        Tranzitie endRead=new Tranzitie(Arrays.asList(readWorkerin,readWorkerout),"endRead");

        Tranzitie startWrite=new Tranzitie(Arrays.asList(workerWrittingin,workerWrittingout),"startWrite");
        Tranzitie endWrite=new Tranzitie(Arrays.asList(writtingWorkerin,writtingWorkerout),"endWrite");

        this.tranzitie=Arrays.asList(startRead,endRead,startWrite,endWrite);
    }
    @Override
    public void Mesaj(String actiune)
    {
        if(actiune.equals("startRead"))
        {
            System.out.println("Start reading");
        }
        else if(actiune.equals("endRead"))
        {
            System.out.println("End reading");
        }
        else if(actiune.equals("startWrite"))
        {
            System.out.println("Start writting");
        }
        else if(actiune.equals("endWrite"))
        {
            System.out.println("End writting");
        }
        else {
            System.out.println("Nothing");
        }
    }
}

