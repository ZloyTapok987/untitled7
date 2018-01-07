package com.company;

public class Teacher implements People
{

    private int height;
    private int weight;
    public Teacher(int h,int w)
    {
        this.weight=w;
        this.height=h;
    }
    @Override
    public int GetHeight() {
        return this.height;
    }

    @Override
    public int GetWeight()
    {
        return this.weight;
    }

    @Override
    public void Eat()
    {
        this.weight++;
    }
    public void Sleep()
    {
        return;
    }
    public boolean equals(Object s) {
        if (!(s instanceof Teacher)) return false;
        if (this.GetWeight()==((Sportsmen) s).GetWeight()&& this.GetHeight()==((Sportsmen) s).GetHeight()) return true;
        return false;
    }
    public String toString() {
        String ans="Teacher: Height "+this.GetHeight()+" Weight "+this.GetWeight();
        return ans;
    }

}
