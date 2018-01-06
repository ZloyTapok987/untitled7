package com.company;

import java.security.PublicKey;

public class Student
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
