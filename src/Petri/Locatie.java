package Petri;

public class Locatie {
    private String tag;
    public int jetoane;
    public Locatie(String tag,int jetoane)
    {
        this.tag=tag;
        this.jetoane=jetoane;
    }

    public int getJetoane()
    {
        return jetoane;
    }

    public String getTag()
    {
        return tag;
    }
    public void addJeton(int jetoane)
    {
        this.jetoane=jetoane;
    }
    public void removeJeton(int jetoane)
    {
        this.jetoane-=jetoane;
    }
}
