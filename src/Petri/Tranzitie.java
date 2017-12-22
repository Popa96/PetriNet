package Petri;

import Petri.Arc;

import java.util.List;

public class Tranzitie implements PetriFunction {
    private String tag;
    private List<Arc>listaArc;

    public Tranzitie(List<Arc> listaArc,String tag)
    {
        this.listaArc=listaArc;
        this.tag=tag;
    }

    @Override
    public boolean isValid()
    {
        boolean isValidated=false;

        for(Arc arc : listaArc){
            if(arc.isValid())
               isValidated=true;
        }


        return isValidated;

    }

    @Override
    public void update()
    {
        for(Arc arc : listaArc)
            arc.update();


    }
    public String getTag()
    {
        return tag;
    }
}
