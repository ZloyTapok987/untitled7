package com.company;

public class Sportsmen extends Student
{
    private int strength;
    public Sportsmen(int s)
    {
        super(180,65);
        this.strength=s;
    }
    public Sportsmen()
    {
        super(180,65);
        this.strength=10;
    }
    protected int GetStrength()
    {
        return this.strength;
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
