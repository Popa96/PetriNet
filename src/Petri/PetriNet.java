package Petri;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public abstract class PetriNet
{
    protected List<Tranzitie> tranzitie;

    public void execut(String action)
    {
        ArrayList<Tranzitie> tranzitieList=new ArrayList<Tranzitie>();
        for(int i=0;i<tranzitie.size();i++)
        {
            if(tranzitie.get(i).getTag().equals(action )&& tranzitie.get(i).isValid())
            {
                tranzitieList.add(tranzitie.get(i));
            }
        }
        for(Tranzitie tranzitie:tranzitieList)
        {
            tranzitie.update();
        }

        Mesaj(action);
    }

    public abstract void Mesaj(String actiune);
{

}
}
