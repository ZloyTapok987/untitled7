package com.company;

public class Sportsmen extends Student implements People
{
    private int strength;
    public Sportsmen(int s)
    {
        super(180,65);
        this.strength=s;
    }
    protected int GetStrength()
    {
        return this.strength;
    }

    @Override
    public void How() {
        System.out.println("Sportsmen "+this.GetHeight());
    }

    @Override
    public String toString() {
        String ans="Sportsmen: Height "+this.GetHeight()+" Weight "+this.GetWeight()+" Strength "+this.strength;
        return ans;
    }

    @Override
    public boolean equals(Object s) {
        if (!(s instanceof Sportsmen)) return false;
        if (this.GetWeight()==((Sportsmen) s).GetWeight()&& this.GetHeight()==((Sportsmen) s).GetHeight() && this.GetStrength()==((Sportsmen) s).GetStrength()) return true;
        return false;
    }

    public Sportsmen(Sportsmen s)
    {
        super(s.GetHeight(),s.GetWeight());
        this.strength=s.GetStrength();
    }
    public void Trein()
    {
        this.strength++;
    }

}
