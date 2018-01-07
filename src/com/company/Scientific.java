package com.company;
public class Scientific extends Student
{
    private int mind;
    public Scientific(int m)
    {
        super(180,65);
        this.mind=m;
    }
    public void learn()
    {
        this.mind++;
    }

    @Override
    public void How() {
        System.out.println("Scientific");
    }

    @Override
    public boolean equals(Object s) {
       if (!(s instanceof Scientific)) return false;
       if (this.GetWeight()==((Scientific) s).GetWeight()&& this.GetHeight()==((Scientific) s).GetHeight() && this.GetMind()==((Scientific) s).GetMind()) return true;
       return false;
    }

    @Override
    public String toString() {
     String ans="Scientific: "+" Height "+this.GetHeight()+" Weight "+this.GetWeight()+" Mind "+this.mind;
     return ans;
    }

    protected int GetMind()
    {
        return this.mind;
    }

}
