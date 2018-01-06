package com.company;

public class Scientific extends Student
{
    private int mind;
    public Scientific(int m)
    {
        super(180,65);
        this.mind=m;
    }
    public Scientific()
    {
        super(180,65);
        this.mind=10;
    }
    public Scientific(Scientific s)
    {
        super(s.GetHeight(),s.GetWeight());
        this.mind=s.GetMind();
    }
    public void learn()
    {
        this.mind++;
    }
    protected int GetMind()
    {
        return this.mind;
    }

}
