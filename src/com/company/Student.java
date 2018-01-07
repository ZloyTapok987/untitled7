package com.company;

import java.security.PublicKey;

public abstract class Student
{
    private int height;
    private int weight;
    public Student(int h,int w)
    {
        this.height=h;
        this.weight=w;
    }
    public Student()
    {
        this.height=180;
        this.weight=65;
    }
    public abstract String toString();
    public abstract boolean equals(Object s);
    public abstract void How();
    public int GetHeight()
    {
        return this.height;
    }
    public int GetWeight()
    {
        return this.weight;
    }
    public void Eat()
    {
        this.weight++;
    }
}
