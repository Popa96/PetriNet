package Petri;

public class Arc implements PetriFunction {
    public int capacitate;
    private String directie;
    private Locatie locatie;

    public Arc(Locatie locatie, int capacitate, String directie)
    {
        this.locatie=locatie;
        this.capacitate=capacitate;
        this.directie=directie;
    }

    @Override
    public boolean isValid() {
       boolean isValidated=false;

       if(directie.equals("in") && locatie.getJetoane()<=capacitate)
       {
           isValidated=true;
       }
        return isValidated;
    }

    @Override
    public void update() {

        if(directie.equals("in"))
        {
            locatie.addJeton(capacitate);
        }
       locatie.removeJeton(capacitate);
    }


}
