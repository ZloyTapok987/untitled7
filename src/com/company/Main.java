package com.company;

        import java.util.*;
        import java.lang.*;
        import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        Student s[]=new Student[2];
        s[0]=new Sportsmen(10);
        s[1]=new Scientific(12);
        s[0].How();
        System.out.println(s[0]);
        System.out.println(s[1]);
        if (s[0]==s[1])
        {
            System.out.println("Yes");
        }
        else System.out.println("No");
        People[] people=new People[4];
        people[0]=new Teacher(190,100);
        people[1]=new Sportsmen(30);
        people[2]=new Scientific(100);
        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println(people[2]);
    }
}
